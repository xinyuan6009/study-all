package com.xinyuan.provider.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.provider.main
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/26
 * @Version V1.0
 */
public class BootStrap {

	static Logger logger = LoggerFactory.getLogger(BootStrap.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/provider.xml");
			//spring-context.xml配置加入
			/*
			<import resource="dubbo-provider.xml" />
			*/
			context.start();
		} catch (Exception e) {
			logger.error("== DubboProvider context start error:",e);
		}
		synchronized (BootStrap.class) {
			while (true) {
				try {
					BootStrap.class.wait();
				} catch (InterruptedException e) {
					logger.error("== synchronized error:",e);
				}
			}
		}

		//com.alibaba.dubbo.container.Main.main(args);
	}
}
