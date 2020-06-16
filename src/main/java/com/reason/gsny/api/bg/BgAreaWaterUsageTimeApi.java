package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsageTime;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.repository.bg.BgAreaWaterUsageTimeRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/bg")
public class BgAreaWaterUsageTimeApi {
    @Autowired
    private BgAreaWaterUsageTimeRepo bgAreaWaterUsageTimeRepo;

    @ApiOperation(value="获取区域一天的用水信息", notes="获取区域一天的用水信息")
    @GetMapping(value = "/findAreaWaterUsage")
    @ResponseStatus(HttpStatus.OK)
    public List<BgAreaWaterUsageTime> findAreaWaterUsage()
    {
        List<BgAreaWaterUsageTime> lists=  bgAreaWaterUsageTimeRepo.findAll();
        return lists;
    }



}
