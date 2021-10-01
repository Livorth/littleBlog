package cn.livorth.blog.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 用户
 * @author: livorth
 * @create: 2021-09-28 19:04
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {

    /**
     * 数据库自增
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;
}
