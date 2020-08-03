package com.anthotel.admin.mapper;

import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.Hospital;
import com.anthotel.admin.entity.QueryIndustry;

import java.util.List;

public interface HospitalMapper {

    List<Hospital> QueryHospitelListByCommand(QueryIndustry queryIndustry);
}