package cn.livorth.blog.entity.params;

import cn.livorth.blog.entity.vo.CategoryVo;
import cn.livorth.blog.entity.vo.TagVo;
import lombok.Data;

import java.util.List;

/**
 * @program: blog
 * @description: 文章信息
 * @author: livorth
 * @create: 2021-09-28 19:11
 **/
@Data
public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;
}
