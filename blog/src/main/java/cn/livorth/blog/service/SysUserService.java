package cn.livorth.blog.service;

import cn.livorth.blog.entity.pojo.SysUser;
import cn.livorth.blog.entity.vo.Result;
import cn.livorth.blog.entity.vo.UserVo;

/**
 * @program: blog
 * @description:
 * @author: livorth
 * @create: 2021-09-28 19:38
 **/
public interface SysUserService {

    /**
     * 根据用户id获取信息
     * @param id
     * @return
     */
    UserVo findUserVoById(Long id);

    /**
     * 根据id获取完整信息
     * @param id
     * @return
     */
    SysUser findUserById(Long id);

    /**
     * 根据账户与密码查询用户，即验证登录
     * @param account
     * @param password
     * @return
     */
    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账户查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);
}
