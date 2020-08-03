package com.anthotel.admin.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
@ApiModel(value = "列车",description = "列车出行路线推荐")
public class JourneysDealed implements Serializable {
    @ApiModelProperty(value = "出行序号")
    private Integer journeyNumber;

    @ApiModelProperty(value = "出发站-结束站")
    private String journeyName;

    @ApiModelProperty(value = "路线等级")
    private Integer routeNumber;

    @ApiModelProperty(value = "时长")
    private Double theDuration;

    @ApiModelProperty(value = "价格")
    private Integer thePrice;

    @ApiModelProperty(value = "类型")
    private String theType;

    @ApiModelProperty(value = "火车名称")
    private String vehicleName;

    @ApiModelProperty(value = "出发站")
    private String departureStationName;

    @ApiModelProperty(value = "结束站")
    private String arriveStationName;

    @ApiModelProperty(value = "出发时间")
    private String departureTime;

    @ApiModelProperty(value = "评分1")
    private Double recommand1;

    @ApiModelProperty(value = "评分2")
    private Double recommand2;

    @ApiModelProperty(value = "评分3")
    private Double recommand3;

    @ApiModelProperty(value = "评分4")
    private Double recommand4;

    @ApiModelProperty(value = "评分5")
    private Double recommand5;

    @ApiModelProperty(value = "结束时间")
    private String arriveTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", journeyNumber=").append(journeyNumber);
        sb.append(", journeyName=").append(journeyName);
        sb.append(", routeNumber=").append(routeNumber);
        sb.append(", theDuration=").append(theDuration);
        sb.append(", thePrice=").append(thePrice);
        sb.append(", theType=").append(theType);
        sb.append(", vehicleName=").append(vehicleName);
        sb.append(", departureStationName=").append(departureStationName);
        sb.append(", arriveStationName=").append(arriveStationName);
        sb.append(", departureTime=").append(departureTime);
        sb.append(", recommand1=").append(recommand1);
        sb.append(", recommand2=").append(recommand2);
        sb.append(", recommand3=").append(recommand3);
        sb.append(", recommand4=").append(recommand4);
        sb.append(", recommand5=").append(recommand5);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}