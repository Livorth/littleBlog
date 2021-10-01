package cn.livorth.blog.service;

import cn.livorth.blog.entity.vo.CategoryVo;
import cn.livorth.blog.entity.vo.Result;

/**
 * @program: blog
 * @description: 分类服务
 * @author: livorth
 * @create: 2021-09-28 22:26
 **/
public interface CategoryService {

    /**
     * 通过id查找分类
     * @param categoryId
     * @return
     */
    CategoryVo findCategoryById(Long categoryId);

    /**
     * 查找全部
     * @return
     */
    Result findAll();

    /**
     * 获取全部分类的详细信息
     * @return
     */
    Result findAllDetail();

    /**
     * 获取详细信息
     * @param id
     * @return
     */
    Result categoryDetailById(Long id);
}
