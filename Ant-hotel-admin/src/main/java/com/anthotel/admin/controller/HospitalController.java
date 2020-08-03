package com.anthotel.admin.controller;

import com.anthotel.admin.dto.Hospital;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.service.impl.HospitalServiceImpl;
import com.anthotel.common.base.ResultKit;
import com.anthotel.common.utils.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("Hospital")
@Api(tags = "医院")
public class HospitalController {

    @Autowired
    HospitalServiceImpl hospitalServiceImpl;

    @ApiOperation("地点查询通过推荐值")
    @PostMapping("QueryHospitelListByReCommands")
    ResultKit<Object> QueryHospitelListByReCommands(@RequestBody QueryIndustry queryIndustry) {
        ResultKit<Object> resultKit = new ResultKit<>();
        List<Hospital> attractions = hospitalServiceImpl.QueryHospitelListByReCommands(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询医院成功");
        resultKit.setData(attractions);
        return resultKit;
    }

}
