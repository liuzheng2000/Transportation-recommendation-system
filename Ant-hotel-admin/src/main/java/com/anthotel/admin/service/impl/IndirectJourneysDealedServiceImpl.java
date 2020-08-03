package com.anthotel.admin.service.impl;

import com.anthotel.admin.entity.ReturnRecommendRoute;
import com.anthotel.admin.entity.TrainQuery;
import com.anthotel.admin.mapper.IndirectJourneysDealedMapper;
import com.anthotel.admin.mapper.JourneysDealedMapper;
import com.anthotel.admin.service.IndirectJourneysDealedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class IndirectJourneysDealedServiceImpl implements IndirectJourneysDealedService {

    @Autowired
    IndirectJourneysDealedMapper indirectJourneysDealedMapper;

    @Override
    public List<ReturnRecommendRoute> QueryIndirectJourneysDealedListByrecommand(TrainQuery trainQuery) {
        List<ReturnRecommendRoute> returnRecommendRoutes = indirectJourneysDealedMapper.queryIndirectJourneysDealedListByrecommand(trainQuery);
        return returnRecommendRoutes;
    }

    @Override
    public List<ReturnRecommendRoute> QueryIndirectJourneysDealedListByprice(TrainQuery trainQuery) {
        List<ReturnRecommendRoute> returnRecommendRoutes = indirectJourneysDealedMapper.queryIndirectJourneysDealedListByPrice(trainQuery);
        return returnRecommendRoutes;
    }
}
