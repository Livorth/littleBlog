package cn.livorth.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 标签
 * @author: livorth
 * @create: 2021-09-28 19:05
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    private Long id;

    private String avatar;

    private String tagName;

}
