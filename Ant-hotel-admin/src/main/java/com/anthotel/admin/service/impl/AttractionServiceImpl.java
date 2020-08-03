package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.mapper.AttractionMapper;
import com.anthotel.admin.service.AttractionServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionServie {

    @Autowired
    AttractionMapper attractionMapper;

    @Override
    public List<Attraction> QueryAttractionListByRecommends(QueryIndustry queryIndustry) {
        List<Attraction> attractions = attractionMapper.queryAttracionListByRecommends(queryIndustry);
        return attractions;
}
}
