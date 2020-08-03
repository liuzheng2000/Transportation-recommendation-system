package com.anthotel.admin.service;

import com.anthotel.admin.dto.Hotel;
import com.anthotel.admin.dto.Restaurant;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface RestaurantService {

    /**
     * 查找餐厅(根据价钱)
     * @param queryIndustry
     * @return
     */
    List<Restaurant> QueryRestaurantListByPrice(QueryIndustry queryIndustry);

    /**
     * 查找餐厅(根据推荐值推荐)
     * @param queryIndustry
     * @return
     */
    List<Restaurant> QueryRestaurantListByRecommends(QueryIndustry queryIndustry);
}
