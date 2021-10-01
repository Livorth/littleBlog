package cn.livorth.blog.controller;

import cn.livorth.blog.entity.vo.Result;
import cn.livorth.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: blog
 * @description: 标签控制类
 * @author: livorth
 * @create: 2021-09-29 19:58
 **/
@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService tagService;

    /**
     * 获取前6个热门标签
     * @return
     */
    @GetMapping("hot")
    public Result hot(){
        int limit = 6;
        return tagService.hots(limit);
    }

    /**
     * 直接访问就是获取全部
     * @return
     */
    @GetMapping
    public Result findAll(){
        return tagService.findAll();
    }

    /**
     * detail即获取详细的信息
     * @return
     */
    @GetMapping("detail")
    public Result findAllDetail(){
        return tagService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        return tagService.findDetailById(id);
    }

}
