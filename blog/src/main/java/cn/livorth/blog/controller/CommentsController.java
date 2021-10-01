package cn.livorth.blog.controller;

import cn.livorth.blog.entity.params.CommentParam;
import cn.livorth.blog.entity.vo.Result;
import cn.livorth.blog.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: blog
 * @description: 评论
 * @author: livorth
 * @create: 2021-09-30 17:36
 **/

@RestController
@RequestMapping("comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;

    /**
     * /comments/article/{id}
     * 返回当前文章的相关评论，包括评论的评论
     * @param id
     * @return
     */
    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id){
        return commentsService.commentsByArticleId(id);
    }

    /**
     * 评论操作，创建相关信息
     * @param commentParam
     * @return
     */
    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam){
        return commentsService.comment(commentParam);
    }
}
