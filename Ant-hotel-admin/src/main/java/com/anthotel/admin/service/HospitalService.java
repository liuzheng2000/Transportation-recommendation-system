package com.anthotel.admin.service;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hospital;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface HospitalService {
    /**
     * 查找医院
     * @param queryIndustry
     * @return
     */
    List<Hospital> QueryHospitelListByReCommands(QueryIndustry queryIndustry);

}

