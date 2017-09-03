package com.xinyuan.ann.annotations;

import java.lang.annotation.*;

/**
 * diamond配置的对应的key注解
 * <p>比如diamond配置的内容为 keyName=a,b,c<br/>
 * 则test为对应的key的名称，使用方式如<br/>
 * <code>@DiamondKey("keyName")</code>
 * </p>
 * @author dufeng.zld
 * @since 1.0.0 created at 2014-09-16
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CenterKey {

    /**
     * diamond配置的内容的key
     * <p>值的方式必须为<code>key=a,b,c</code></p>
     * @return 返回配置的key
     */
    String value() default "";

}