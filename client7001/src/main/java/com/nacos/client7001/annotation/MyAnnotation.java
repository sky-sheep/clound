package com.nacos.client7001.annotation;

import java.lang.annotation.*;

/**
 * @author ylx
 * @Target 注解可以用在什么地方
 * @Retention 表示注解在什么地方有效
 * @Documented 表示注解是否生成在javadoc中
 * @Inherited 表示子类可以继承父类的注解
 */
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {

    String name();

    String age() default "23";
}
