package cn.livorth.blog.entity.params;

import lombok.Data;

/**
 * @program: blog
 * @description: 传入的页面参数
 * @author: livorth
 * @create: 2021-09-28 19:11
 **/
@Data
public class PageParams {
    private int page = 1;

    private int pageSize = 10;

    private Long categoryId;

    private Long tagId;

    private String year;

    private String month;

    public String getMonth(){
        if (this.month != null && this.month.length() == 1){
            return "0"+this.month;
        }
        return this.month;
    }
}
