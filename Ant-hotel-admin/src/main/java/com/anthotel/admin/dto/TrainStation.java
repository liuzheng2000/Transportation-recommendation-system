package com.anthotel.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "列车类",description = "地铁站位置")
public class TrainStation<T> extends PlaceBase{
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

    @ApiModelProperty(value = "景点类型")
    private String tag;

    @ApiModelProperty(value = "范围")
    private String type;

    @ApiModelProperty(value = "总体评分")
    private String overallRating;

    @ApiModelProperty(value = "评论数量")
    private String commentNum;

    @ApiModelProperty(value = "纬度")
    private Float locationLat;

    @ApiModelProperty(value = "经度")
    private Float locationLng;

    @ApiModelProperty(value = "卫星维度")
    private Float naviLocationLat;

    @ApiModelProperty(value = "卫星经度")
    private Float naviLocationLng;

}