package com.xinyuan.consumer.controller;

import com.xinyuan.consumer.service.TestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.consumer.controller
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/26
 * @Version V1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestConsumerService testConsumerService;

	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello(HttpServletRequest request){
		String name = request.getParameter("name");
		testConsumerService.sayHello(name);
		return "ok";
	}
}
