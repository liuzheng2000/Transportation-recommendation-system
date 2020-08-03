package com.anthotel.admin.controller;


import com.anthotel.admin.dto.Attraction;
import com.anthotel.admin.dto.PlaceBase;
import com.anthotel.admin.entity.QueryIndustry;
import com.anthotel.admin.service.impl.AttractionServiceImpl;
import com.anthotel.common.base.ResultKit;
import com.anthotel.common.utils.CglibBean;
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
@RequestMapping("Attraction")
@Api(tags = "景点")
public class AttractionController {

    @Autowired
    AttractionServiceImpl attractionService;

    @ApiOperation("地点查询通过推荐值")
    @PostMapping("QueryAttractionByRecommends")
    ResultKit<Object> QueryAttractionByRecommends(@RequestBody QueryIndustry queryIndustry) {
        ResultKit<Object> resultKit = new ResultKit<>();
        List<Attraction> attractions = attractionService.QueryAttractionListByRecommends(queryIndustry);
        resultKit.setCode(ResultCode.SUCCESS.code());
        resultKit.setMessage("查询景点成功");
        resultKit.setData(attractions);
        return resultKit;
    }

}
