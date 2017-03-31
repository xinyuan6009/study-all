package com.xinyuan.subjects;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.subjects
 * @Description: ${TODO}
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/31
 * @Version V1.0
 */
public class ConcreteSubject extends CommSubject {

	//被订阅者状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void updateState(String newState){
		subjectState = newState;
		this.notifyObserves();
	}
}
