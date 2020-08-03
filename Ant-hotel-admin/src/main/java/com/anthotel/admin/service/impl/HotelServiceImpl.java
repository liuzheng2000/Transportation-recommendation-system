package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hotel;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.mapper.HotelMapper;
import com.anthotel.admin.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelMapper hotelMapper;

    @Override
    public List<Hotel> QueryHotelListByPrice(QueryIndustry queryIndustry) {
        List<Hotel> hotels = hotelMapper.queryHotelListByPrice(queryIndustry);
        return hotels;
    }

    @Override
    public List<Hotel> QueryHotelListByRecommends(QueryIndustry queryIndustry) {
        List<Hotel> hotels = hotelMapper.queryHotelListByRecommends(queryIndustry);
        return hotels;
    }
}
