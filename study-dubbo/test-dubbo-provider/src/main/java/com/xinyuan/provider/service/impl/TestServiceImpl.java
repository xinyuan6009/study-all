package com.xinyuan.provider.service.impl;

import com.xinyuan.face.service.TestService;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.service.impl
 * @Description: 服务提供者实现
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/26
 * @Version V1.0
 */
public class TestServiceImpl implements TestService {

	public void sayHello(String name) {
		System.out.println("欢迎您:"+name);
	}
}
