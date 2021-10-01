package cn.livorth.blog.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: blog
 * @description: 通用返回类
 * @author: livorth
 * @create: 2021-09-28 17:24
 **/
@Data
@AllArgsConstructor
public class Result {
    private boolean success;

    private int code;

    private String msg;

    private Object data;


    public static Result success(Object data){
        return new Result(true,200,"success", data);
    }

    public static Result fail(int code, String msg){
        return new Result(false,code,msg,null);
    }
}

/*
前后端交互的标准json格式，不过说实话这些常量应该是要用枚举类单独提出来的
{
    "success": ***,
    "code": 200,
    "msg": "success",
    "data": ***
}
 */
