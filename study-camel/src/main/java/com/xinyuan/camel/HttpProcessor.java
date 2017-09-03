package com.xinyuan.camel;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 这个处理器用来完成输入的json格式的转换 * @author yinwenjie
 */
public class HttpProcessor implements Processor {
    /* (non-Javadoc) * @see org.apache.camel.Processor#process(org.apache.camel.Exchange) */
    @Override
    public void process(Exchange exchange) throws Exception {
        // 因为很明确消息格式是http的，所以才使用这个类 // 否则还是建议使用org.apache.camel.Message这个抽象接口
        Message message = exchange.getIn();
        InputStream bodyStream = (InputStream) message.getBody();
        String inputContext = this.analysisMessage(bodyStream);
        bodyStream.close();
        // 存入到exchange的out区域
        if (exchange.getPattern() == ExchangePattern.InOut) {
            Message outMessage = exchange.getOut();
            outMessage.setBody(inputContext + " || out");
        }
    }

    /**
     * 从stream中分析字符串内容 * @param bodyStream * @return
     */
    private String analysisMessage(InputStream bodyStream) throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] contextBytes = new byte[4096];
        int realLen;
        while ((realLen = bodyStream.read(contextBytes, 0, 4096)) != -1) {
            outStream.write(contextBytes, 0, realLen);
        }
        // 返回从Stream中读取的字串
        try {
            return new String(outStream.toByteArray(), "UTF-8");
        } finally {
            outStream.close();
        }
    }
}