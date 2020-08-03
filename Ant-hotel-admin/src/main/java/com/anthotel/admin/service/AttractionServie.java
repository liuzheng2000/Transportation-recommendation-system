package com.anthotel.admin.service;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.entity.QueryIndustry;


import java.util.List;

/**
 * @author Administrator
 */
public interface AttractionServie {
    /**
     * 查找景点(根据推荐值推荐)
     * @param queryIndustry
     * @return
     */
    List<Attraction> QueryAttractionListByRecommends(QueryIndustry queryIndustry);

}
