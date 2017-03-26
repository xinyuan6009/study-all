package com.xinyuan.consumer.service.impl;

import com.xinyuan.consumer.service.TestConsumerService;
import com.xinyuan.face.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.consumer.service
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/26
 * @Version V1.0
 */
@Service()
public class TestServiceImpl implements TestConsumerService {

	@Autowired
	private TestService testService;

	public void sayHello(String name) {
		testService.sayHello(name);
	}
}
