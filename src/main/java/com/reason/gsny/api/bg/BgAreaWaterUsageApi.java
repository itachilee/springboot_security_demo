package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.entity.dto.AreaWaterUsage2;
import com.reason.gsny.entity.dto.AreaWaterUsage3;
import com.reason.gsny.entity.dto.AreaWaterUsage4;
import com.reason.gsny.service.bg.BgAreaWaterUsageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/bg")
public class BgAreaWaterUsageApi {

    @Autowired
    private BgAreaWaterUsageService bgAreaWaterUsageService;

    @ApiOperation(value="获取区域所有按年月分组的信息", notes="获取区域所有按年月分组的信息")
    @GetMapping(value = "/findWaterAndCostByDate")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findWaterAndCostByDate()
    {
        return bgAreaWaterUsageService.findWaterAndCostByDate();
    }

    @ApiOperation(value="获取区域当月用水与充值信息", notes="获取区域当月用水与充值信息")
    @GetMapping(value = "/findWaterAndCostByThisMonth")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findWaterAndCostByThisMonth()
    {
        return bgAreaWaterUsageService.findWaterAndCostByThisMonth();
    }
    @ApiOperation(value="按区域分组获取到每组的用水量", notes="按区域分组获取到每组的用水量")
    @GetMapping(value = "/findWaterAndCostByArea")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage2> findWaterAndCostByArea()
    {
        return bgAreaWaterUsageService.findWaterAndCostByArea();
    }
    @ApiOperation(value="按区域分组获取到每组的用水量並按分月進行分鐘", notes="按区域分组获取到每组的用水量並按分月進行分組")
    @GetMapping(value = "/findWaterAndCostByAreaGroupByMonth")
    @ResponseStatus(HttpStatus.OK)
    public Map<String,List<AreaWaterUsage3>> findWaterAndCostByAreaGroupByMonth()
    {
        return bgAreaWaterUsageService.findWaterAndCostByAreaGroupByMonth();
    }


    @ApiOperation(value="获取每天平均的用水量", notes="获取每天平均的用水量")
    @GetMapping(value = "/findWaterAndCostByDay")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findWaterAndCostByDay()
    {
        return  bgAreaWaterUsageService.findWaterAndCostByDay();
    }
    @ApiOperation(value="获取每月平均的用水量", notes="获取每月平均的用水量")
    @GetMapping(value = "/findWaterAndCostByMonth")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findWaterAndCostByMonth()
    {
        return  bgAreaWaterUsageService.findWaterAndCostByMonth();
    }

    @ApiOperation(value="获取一天中每小时平均的用水量", notes="获取一天中每小时平均的用水量")
    @GetMapping(value = "/findWaterAndCostByHour")
    @ResponseStatus(HttpStatus.OK)
    public Map<String,List<AreaWaterUsage3>> findWaterAndCostByHour()
    {
        return bgAreaWaterUsageService.findWaterAndCostByHour();
    }
    @ApiOperation(value="获取所有的用水量与充值金额", notes="获取所有的用水量与充值金额")
    @GetMapping(value = "/findAllBgAreaWaterUsage")
    @ResponseStatus(HttpStatus.OK)
    public List<BgAreaWaterUsage> findAll(){

        return bgAreaWaterUsageService.findAll();
    }
    @ApiOperation(value="获取总充值金额与总用水量", notes="获取总充值金额与总用水量")
    @GetMapping(value = "/findWaterAndCostForLossRate")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage4> findWaterAndCostForLossRate(){

        return bgAreaWaterUsageService.findWaterAndCostForLossRate();
    }
    @ApiOperation(value="获取每个月的总充值金额与总用水量", notes="获取每个月的总充值金额与总用水量")
    @GetMapping(value = "/findWaterAndCostForLossRateGroupByMonth")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage4> findWaterAndCostForLossRateGroupByMonth(){

        return bgAreaWaterUsageService.findWaterAndCostForLossRateGroupByMonth();
    }


    @ApiOperation(value="获取这个月充值金额与总用水量", notes="获取这个月充值金额与总用水量")
    @GetMapping(value = "/findWaterAndCostForLossRateByMonth")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage4> findWaterAndCostForLossRateByMonth(){

        return bgAreaWaterUsageService.findWaterAndCostForLossRateByMonth();
    }
    @ApiOperation(value="获取当前年充值金额与总用水量", notes="获取当前年充值金额与总用水量")
    @GetMapping(value = "/findWaterAndCostForLossRateByYear")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage4> findWaterAndCostForLossRateByYear(){

        return bgAreaWaterUsageService.findWaterAndCostForLossRateByYear();
    }


}
