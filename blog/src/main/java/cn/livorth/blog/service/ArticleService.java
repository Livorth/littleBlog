package cn.livorth.blog.service;

import cn.livorth.blog.entity.params.ArticleParam;
import cn.livorth.blog.entity.params.PageParams;
import cn.livorth.blog.entity.vo.Result;


/**
 * @program: blog
 * @description: 文章服务层
 * @author: livorth
 * @create: 2021-09-28 19:17
 **/
public interface ArticleService {
    /**
     * 分页查询 文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticles(int limit);

    /**
     * 文章首页归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);

    /**
     * 文章发布服务
     * @param articleParam
     * @return
     */
    Result publish(ArticleParam articleParam);
}

