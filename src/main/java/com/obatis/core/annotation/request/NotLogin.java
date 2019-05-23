package com.obatis.core.annotation.request;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * api 接口不需要登录注解，添加此注解的 Controller 方法，表示无需登录即可通过验证
 * 在微服务体系里面，默认会将此方法注册到权限验证中心，配合网关做安全验证,则不会缓存在 NotLoginAnnotationUrl 中
 * 如为单体应用，则会将添加此注册的Controller 方法缓存在 NotLoginAnnotationUrl 中，通过传入 URL判断是否为不需登录的接口，具体看代码注释
 * @author HuangLongPu
 */
@Target({ METHOD })
@Retention(RUNTIME)
@Documented
public @interface NotLogin {

    /**
     * URL名称，优先级最高，如果未填写，再基于Swagger获取URL名称
     * @return
     */
    String urlName() default "";
}
