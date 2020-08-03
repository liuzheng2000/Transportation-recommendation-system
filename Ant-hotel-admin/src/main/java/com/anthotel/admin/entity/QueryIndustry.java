package com.anthotel.admin.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author Administrator
 */
@ApiModel(value = "查询类",description = "地点查询")
@Data
public class QueryIndustry {

    @ApiModelProperty(value = "省区")
    private String ScenicAreaProvince;

    @ApiModelProperty(value = "城区")
    private String ScenicAreaCity;

    @ApiModelProperty(value = "具体位置")
    private String ScenicAreaArea;

    @ApiModelProperty(value = "查询的地点类型")
    private String[] LocationType;

    @ApiModelProperty(value = "是否根据价钱排序")
    private String price;

    @ApiModelProperty(value = "推荐值1")
    private String recommend1;

    @ApiModelProperty(value = "推荐值2")
    private String recommend2;

}
