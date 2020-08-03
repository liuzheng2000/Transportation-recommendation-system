package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.Entertainment;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.mapper.EntertainmentMapper;
import com.anthotel.admin.service.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class EntertainmentServiceImpl implements EntertainmentService {

    @Autowired
    EntertainmentMapper entertainmentMapper;
    @Override
    public List<Entertainment> queryEntertainmentListByRecommands(QueryIndustry queryIndustry) {
        List<Entertainment> entertainments = entertainmentMapper.queryEntertainmentListByRecommand(queryIndustry);
        return entertainments;
    }
}
