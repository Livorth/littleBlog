package cn.livorth.blog.handler;

import cn.livorth.blog.entity.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: blog
 * @description: 统一异常处理类
 * @author: livorth
 * @create: 2021-09-29 20:17
 **/
@ControllerAdvice
public class AllExceptionHandler {
    /**
     * 进行异常处理，处理Exception.class的异常
     * 然后返回的是json类型的数据
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result doException(Exception ex){
        ex.printStackTrace();
        return Result.fail(-999,"系统异常");
    }
}
