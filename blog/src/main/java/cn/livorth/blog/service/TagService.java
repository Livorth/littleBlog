package cn.livorth.blog.service;

import cn.livorth.blog.entity.vo.Result;
import cn.livorth.blog.entity.vo.TagVo;

import java.util.List;

/**
 * @program: blog
 * @description: 标签服务层
 * @author: livorth
 * @create: 2021-09-28 19:42
 **/
public interface TagService {
    /**
     * 根据文章id查询其标签
     * @param articleId
     * @return
     */
    List<TagVo> findTagsByArticleId(Long articleId);

    /**
     * 查找热门标签
     * @param limit
     * @return
     */
    Result hots(int limit);

    /**
     * 查找所有的标签
     * @return
     */
    Result findAll();

    /**
     * 查找全部的标签以及其对应的信息
     * @return
     */
    Result findAllDetail();

    /**
     * 查找标签对应的信息
     * @param id
     * @return
     */
    Result findDetailById(Long id);
}
