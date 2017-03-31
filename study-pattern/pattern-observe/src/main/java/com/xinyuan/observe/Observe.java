package com.xinyuan.observe;

import com.xinyuan.subjects.CommSubject;

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
public interface Observe {

	public void update(CommSubject subject);
}
