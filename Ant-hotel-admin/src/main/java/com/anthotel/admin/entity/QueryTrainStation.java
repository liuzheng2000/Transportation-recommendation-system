package com.anthotel.admin.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Administrator
 */
@ApiModel(value = "查询类",description = "查询站点")
@Data
public class QueryTrainStation {

    @ApiModelProperty(value = "站点名称")
    private String name;

    @ApiModelProperty(value = "站点省份" ,example = "北京市")
    private String province;

    @ApiModelProperty(value = "站点城市")
    private String city;

    @ApiModelProperty(value = "站点区域")
    private String area;

}
