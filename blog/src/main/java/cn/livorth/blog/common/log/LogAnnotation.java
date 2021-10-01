package cn.livorth.blog.common.log;

import java.lang.annotation.*;

/**
 * @program: blog
 * @description: 日志注解
 * @author: livorth
 * @create: 2021-09-30 18:31
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operator() default "";
}
