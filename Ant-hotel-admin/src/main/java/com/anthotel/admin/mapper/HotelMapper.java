package com.anthotel.admin.mapper;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hotel;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface HotelMapper {
    /**
     * 是否根据价钱进行排序
     * @param queryIndustry
     * @return
     */
    List<Hotel> queryHotelListByPrice(QueryIndustry queryIndustry);

    /**
     * 根据推荐值进行排序
     * @param queryIndustry
     * @return
     */
    List<Hotel> queryHotelListByRecommends(QueryIndustry queryIndustry);
}