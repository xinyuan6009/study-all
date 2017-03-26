package com.xinyuan.face;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

import java.util.List;

/**
 * Created by Intellij IDEA.
 *
 * @Package com.xinyuan.face
 * @Description: zk客户端相关操作接口
 * @Author xymac
 * @Email zhengyuanyuan@baidu-mgame.com
 * @Date 2017/3/26
 * @Version V1.0
 */
public class ZkClientFace {

	public static void main(String[] args) {
		ZkClient zc = new ZkClient("123.56.146.64:2181",10000,10000,new SerializableSerializer());
		List<String> ls = zc.getChildren("/dubbo");
		System.out.println(ls);
	}
}
