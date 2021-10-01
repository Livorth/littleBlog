package cn.livorth.blog.service;

import cn.livorth.blog.entity.params.CommentParam;
import cn.livorth.blog.entity.vo.Result;

/**
 * @program: blog
 * @description: 评论服务
 * @author: livorth
 * @create: 2021-09-29 12:34
 **/
public interface CommentsService {
    /**
     * 根据文章id 查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);

    Result comment(CommentParam commentParam);
}

