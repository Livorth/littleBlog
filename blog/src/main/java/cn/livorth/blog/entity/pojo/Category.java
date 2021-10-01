package cn.livorth.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 分类
 * @author: livorth
 * @create: 2021-09-28 19:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;

    private String avatar;

    private String categoryName;

    private String description;
}
