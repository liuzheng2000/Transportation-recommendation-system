package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.TrainStation;
import com.anthotel.admin.entity.QueryTrainStation;
import com.anthotel.admin.mapper.TrainStationMapper;
import com.anthotel.admin.service.TrainStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Administrator
 */
@Service
public class TrainStationServiceImpl implements TrainStationService {
    @Autowired
    TrainStationMapper trainStationMapper;
    @Override
    public List<TrainStation> queryListTrainStation(QueryTrainStation queryTrainStation) {
        List<TrainStation> trainStations = trainStationMapper.queryListTrainStation(queryTrainStation);
        return trainStations;
    }
}
