package cn.livorth.blog.entity.vo;

import lombok.Data;

/**
 * @program: blog
 * @description: 分类
 * @author: livorth
 * @create: 2021-09-28 19:22
 **/
@Data
public class CategoryVo {
    private String id;

    private String avatar;

    private String categoryName;

    private String description;
}
