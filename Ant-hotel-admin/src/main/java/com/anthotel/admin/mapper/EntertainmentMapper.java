package com.anthotel.admin.mapper;

import com.anthotel.admin.dto.Entertainment;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface EntertainmentMapper {

    List<Entertainment> queryEntertainmentListByRecommand(QueryIndustry queryIndustry);
}