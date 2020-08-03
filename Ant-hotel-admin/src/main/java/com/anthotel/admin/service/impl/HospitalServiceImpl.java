package com.anthotel.admin.service.impl;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hospital;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.mapper.AttractionMapper;
import com.anthotel.admin.mapper.HospitalMapper;
import com.anthotel.admin.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {


    @Autowired
    HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> QueryHospitelListByReCommands(QueryIndustry queryIndustry) {
        List<Hospital> hospitals = hospitalMapper.QueryHospitelListByCommand(queryIndustry);
        return hospitals;
    }


}
