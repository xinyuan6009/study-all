package com.xinyuan.ann.support;

import com.xinyuan.ann.annotations.CenterConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: 欣元
 * @date: 2017/8/25 下午5:04
 */
public class CenterProcessor {


    public void proccessor(Object bean){
        // 没有@Diamond 注解，不处理
        if (!bean.getClass().isAnnotationPresent(CenterConfig.class)) {
            System.out.println("bean No this annotation");
        }
        CenterConfig centerConfig = bean.getClass().getAnnotation(CenterConfig.class);
        parseAnnotation(centerConfig);
    }

    /**
     * diamond监听器添加，
     * <p>用于将diamond的值初始化到bean的属性以及数据更新后进行回调与更新</p>
     *
     * @param centerConfig diamond相关的配置数据
     */
    private void parseAnnotation(CenterConfig centerConfig) {
        // 获取diamond的关联属性
        String dataId = centerConfig.dataId();
        String groupName = centerConfig.groupName();
        int connTimeOut = centerConfig.connTimeOut();
        if (StringUtils.isBlank(dataId) || StringUtils.isBlank(groupName) || connTimeOut <= 0) {
            throw new RuntimeException("Diamond dataId or groupName or connTimeOut can not be empty");
        }
        //new DiamondValueListener(bean, rawBeanClass, dataId, groupName, connTimeOut);
        System.out.println(dataId+"--"+groupName+"--"+connTimeOut);
    }
}
