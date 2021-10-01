package cn.livorth.blog.controller;

import cn.livorth.blog.entity.params.LoginParam;
import cn.livorth.blog.entity.vo.Result;
import cn.livorth.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: blog
 * @description: 登录
 * @author: livorth
 * @create: 2021-09-30 09:50
 **/

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam){
        //登录 验证用户
        return loginService.login(loginParam);
    }
}
