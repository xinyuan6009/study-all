package com.xinyuan.ann.bean;

import com.xinyuan.ann.annotations.CenterConfig;
import com.xinyuan.ann.annotations.CenterKey;

/**
 * @author: 欣元
 * @date: 2017/8/25 下午5:18
 */
@CenterConfig(dataId = "com.xinyuan.study", groupName = "track-service")
public class HelloBean {

    @CenterKey
    private String hello;

    @CenterKey
    private String world;
}
