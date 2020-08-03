package com.anthotel.admin.service.impl;

import com.anthotel.admin.entity.ReturnRecommendRoute;
import com.anthotel.admin.entity.TrainQuery;
import com.anthotel.admin.mapper.JourneysDealedMapper;
import com.anthotel.admin.service.JourneysDealedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class JourneysDealedServiceImpl implements JourneysDealedService {

    @Autowired
    JourneysDealedMapper  journeysDealedMapper;

    @Override
    public List<ReturnRecommendRoute> QueryJourneysDealedListByrecommand(TrainQuery trainQuery) {
        List<ReturnRecommendRoute> returnRecommendRoutes = journeysDealedMapper.queryJourneysDealedListByrecommand(trainQuery);
        return returnRecommendRoutes;
    }

    @Override
    public List<ReturnRecommendRoute> QueryJourneysDealedListByprice(TrainQuery trainQuery) {
        List<ReturnRecommendRoute> returnRecommendRoutes = journeysDealedMapper.queryJourneysDealedListByPrice(trainQuery);
        return returnRecommendRoutes;
    }


}
