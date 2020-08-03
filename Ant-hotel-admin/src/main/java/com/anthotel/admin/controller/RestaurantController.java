package com.anthotel.admin.controller;


import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Restaurant;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.service.impl.RestaurantServiceImpl;
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

@RestController
@RequestMapping("Restaurant")
@Api(tags = "餐厅")
public class RestaurantController {
    @Autowired
    RestaurantServiceImpl restaurantServiceImpl;

    @ApiOperation("地点查询（可选择是否根据价钱排序）")
    @PostMapping("QueryRestaurantListByPrice")
    ResultKit<Object> QueryRestaurantListByPrice(@RequestBody QueryIndustry queryIndustry) {
        ResultKit<Object> resultKit = new ResultKit<>();
        List<Restaurant> attractions = restaurantServiceImpl.QueryRestaurantListByPrice(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询酒店成功");
        resultKit.setData(attractions);
        return resultKit;
    }

    @ApiOperation("地点查询(通过推荐值)")
    @PostMapping("QueryRestaurantListByRecommends")
    ResultKit<Object> QueryRestaurantListByRecommends(@RequestBody QueryIndustry queryIndustry) {
        ResultKit<Object> resultKit = new ResultKit<>();
        List<Restaurant> restaurants = restaurantServiceImpl.QueryRestaurantListByRecommends(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询景点成功");
        resultKit.setData(restaurants);
        return resultKit;
    }


}
