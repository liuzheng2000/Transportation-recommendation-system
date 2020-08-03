package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.Restaurant;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.mapper.RestaurantMapper;
import com.anthotel.admin.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    RestaurantMapper requestMapping;

    @Override
    public List<Restaurant> QueryRestaurantListByPrice(QueryIndustry queryIndustry) {
        List<Restaurant> restaurants = requestMapping.queryRestaurantList(queryIndustry);
        return restaurants;
    }

    @Override
    public List<Restaurant> QueryRestaurantListByRecommends(QueryIndustry queryIndustry) {
        List<Restaurant> restaurants = requestMapping.queryRestaurantListByRecommends(queryIndustry);
        return restaurants;
    }


}
