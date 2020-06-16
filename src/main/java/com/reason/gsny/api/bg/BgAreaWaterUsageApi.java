package com.reason.gsny.api.bg;

import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.repository.bg.BgAreaWaterUsageRepo;
import com.reason.gsny.service.bg.BgAreaUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bg")
public class BgAreaWaterUsageApi {

    @Autowired
    private BgAreaWaterUsageRepo bgAreaWaterUsageRepo;

    @ApiOperation(value="获取区域用户信息", notes="获取区域用户信息")
    @GetMapping(value = "/findWaterAndCostByDate")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findWaterAndCostByDate()
    {
        List<AreaWaterUsage> lists=  bgAreaWaterUsageRepo.findWaterAndCostByDate();
        return lists;
    }
}
