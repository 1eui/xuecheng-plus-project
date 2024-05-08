package com.xuecheng.base.model;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分页查询的分页参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    // 当前页码
    @ApiModelProperty("页码")
    private Long pageNo = 1L;
    // 每页显示的记录数
    @ApiModelProperty("每页记录数")
    private Long pageSize = 30L;

}
