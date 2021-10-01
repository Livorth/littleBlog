package cn.livorth.blog.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: blog
 * @description: 评论
 * @author: livorth
 * @create: 2021-09-28 19:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Long id;

    private String content;

    private Long createDate;

    private Long articleId;

    private Long authorId;

    private Long parentId;

    private Long toUid;

    private Integer level;
}
