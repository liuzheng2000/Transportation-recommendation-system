package com.anthotel.admin.service;

import com.anthotel.admin.entity.ReturnRecommendRoute;
import com.anthotel.admin.entity.TrainQuery;

import java.util.List;

/**
 * @author Administrator
 */
public interface JourneysDealedService {

    /**
     * 查找列车通过推荐值
     * @param trainQuery
     * @return
     */
    List<ReturnRecommendRoute> QueryJourneysDealedListByrecommand(TrainQuery trainQuery);

    /**
     * 查找列车通过价格
     * @param trainQuery
     * @return
     */
    List<ReturnRecommendRoute> QueryJourneysDealedListByprice(TrainQuery trainQuery);
}
