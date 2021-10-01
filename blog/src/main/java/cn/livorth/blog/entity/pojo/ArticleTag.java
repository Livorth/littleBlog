package cn.livorth.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 文章与标签之间的关系
 * @author: livorth
 * @create: 2021-09-28 19:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleTag {
    private Long id;

    private Long articleId;

    private Long tagId;
}
