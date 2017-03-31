package com.xinyuan.observe;

import com.xinyuan.subjects.CommSubject;
import com.xinyuan.subjects.ConcreteSubject;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.observe
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/31
 * @Version V1.0
 */
public class ConcreteObserve implements Observe {

	private String observeState;

	@Override
	public void update(CommSubject subject) {
		ConcreteSubject concreteSubject = (ConcreteSubject) subject;
		//更新自己的状态
		this.observeState = "observe:"+concreteSubject.getSubjectState();
		System.out.println("订阅者状态已更新 最新状态为:"+this.observeState);
	}
}
