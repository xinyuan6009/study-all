package com.xinyuan.subjects;

import com.xinyuan.observe.Observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.subjects
 * @Description: 被观察对象父类 定义观察者相关操作
 * 				 1.添加观察者 attach
 * 				 2.删除观察者 detach
 * 				 3. notify
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/31
 * @Version V1.0
 */
public class CommSubject {

	//观察者列表
	private List<Observe> observes = new ArrayList<>();

	/**
	 * 添加一个观察者
	 * @param observe
	 */
	public void attach(Observe observe){
		this.observes.add(observe);
	}

	/**
	 * 删除一个观察者
	 * @param observe
	 */
	public void detach(Observe observe){
		this.observes.remove(observe);
	}

	protected void notifyObserves(){
		for (Observe observe:observes) {
			observe.update(this);
		}
	}


}
