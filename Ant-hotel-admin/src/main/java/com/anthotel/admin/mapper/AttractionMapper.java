package com.anthotel.admin.mapper;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface AttractionMapper {

    /**
     * 通过推荐值查询景点
     * @param queryIndustry
     * @return
     */
    List<Attraction> queryAttracionListByRecommends(QueryIndustry queryIndustry);
}