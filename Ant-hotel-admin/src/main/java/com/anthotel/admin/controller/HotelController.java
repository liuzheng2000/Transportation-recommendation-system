package com.anthotel.admin.controller;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hotel;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.service.HotelService;
import com.anthotel.admin.service.impl.AttractionServiceImpl;
import com.anthotel.admin.service.impl.HotelServiceImpl;
import com.anthotel.common.base.ResultKit;
import com.anthotel.common.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



/**
 * @author Administrator
 */
@RestController
@RequestMapping("Hotel")
@Api(tags = "旅馆")
public class HotelController {

    @Autowired
    HotelServiceImpl hotelServiceImpl;

    @ApiOperation("地点查询（可选择是否根据价钱排序）")
    @PostMapping("queryHotelByPrice")
    ResultKit<Object> queryHotelByPrice(@RequestBody QueryIndustry queryIndustry) {

        ResultKit<Object> resultKit = new ResultKit<>();
        List<Hotel> attractions = hotelServiceImpl.QueryHotelListByPrice(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询酒店成功");
        resultKit.setData(attractions);
        return resultKit;
    }

    @ApiOperation("地点查询(通过推荐值)")
    @PostMapping("queryHotelByRecommadn")
    ResultKit<Object> queryHotelByRecommadn(@RequestBody QueryIndustry queryIndustry) {
        ResultKit<Object> resultKit = new ResultKit<>();
        List<Hotel> hotels = hotelServiceImpl.QueryHotelListByRecommends(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询景点成功");
        resultKit.setData(hotels);
        return resultKit;
    }



}
