package com.anthotel.admin.service;

import com.anthotel.admin.dto.Entertainment;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

/**
 * @author Administrator
 */
public interface EntertainmentService {

    /**
     * 查找娱乐场所
     * @param queryIndustry
     * @return
     */
    List<Entertainment> queryEntertainmentListByRecommands(QueryIndustry queryIndustry);
}
