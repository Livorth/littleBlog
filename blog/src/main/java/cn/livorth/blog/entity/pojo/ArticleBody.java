package cn.livorth.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 文章体
 * @author: livorth
 * @create: 2021-09-28 19:02
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleBody {

    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;
}
