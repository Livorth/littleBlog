package cn.livorth.blog.service;

import cn.livorth.blog.entity.params.LoginParam;
import cn.livorth.blog.entity.pojo.SysUser;
import cn.livorth.blog.entity.vo.Result;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登录
     * @param token
     * @return
     */
    Result logout(String token);

    /**
     * 注册
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);
}
