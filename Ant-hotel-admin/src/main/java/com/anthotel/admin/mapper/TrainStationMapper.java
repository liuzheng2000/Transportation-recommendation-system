package com.anthotel.admin.mapper;

import com.anthotel.admin.dto.TrainStation;
import com.anthotel.admin.entity.QueryTrainStation;

import java.util.List;

public interface TrainStationMapper {
    int insert(TrainStation record);

    int insertSelective(TrainStation record);

    List<TrainStation> queryListTrainStation(QueryTrainStation queryTrainStation);
}