package cn.livorth.blog.entity.params;

import lombok.Data;

/**
 * @program: blog
 * @description: 文章体参数
 * @author: livorth
 * @create: 2021-09-28 19:11
 **/
@Data
public class ArticleBodyParam {

    private String content;

    private String contentHtml;

}
