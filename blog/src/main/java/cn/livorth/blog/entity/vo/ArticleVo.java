package cn.livorth.blog.entity.vo;

import lombok.Data;

import java.util.List;


/**
 * @program: blog
 * @description: 文章信息
 * @author: livorth
 * @create: 2021-09-28 19:20
 **/
@Data
public class ArticleVo<ArticleBodyVo> {
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}
