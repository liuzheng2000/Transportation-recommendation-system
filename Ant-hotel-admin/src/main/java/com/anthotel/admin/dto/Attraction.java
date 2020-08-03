package com.anthotel.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
@ApiModel(value = "地点类",description = "景点")
public class Attraction{
    @ApiModelProperty(value = "地点名称")
    private String name;

    @ApiModelProperty(value = "地点省份")
    private String province;

    @ApiModelProperty(value = "地点城市")
    private String city;

    @ApiModelProperty(value = "地点区域")
    private String area;

    @ApiModelProperty(value = "具体位置")
    private String address;

    @ApiModelProperty(value = "纬度")
    private Float locationLat;

    @ApiModelProperty(value = "经度")
    private Float locationLng;

    @ApiModelProperty(value = "评分依据")
    private Float recommends;



}