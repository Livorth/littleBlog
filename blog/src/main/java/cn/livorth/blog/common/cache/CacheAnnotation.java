package cn.livorth.blog.common.cache;

import java.lang.annotation.*;

/**
 * @program: blog
 * @description: 全局缓存注解
 * @author: livorth
 * @create: 2021-09-30 20:50
 **/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CacheAnnotation {
    // 设置过期时间
    long expire() default 1 * 60 * 1000;
    //缓存标识 key
    String name() default "";
}
