package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaWaterUsageAndPayAmount;
import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.service.bg.BgAreaWaterUsageAndPayAmountService;
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
public class BgAreaWaterUsageAndPayAmountApi {
    @Autowired
    BgAreaWaterUsageAndPayAmountService bgAreaWaterUsageAndPayAmountService;


    @ApiOperation(value="获取区域在线的水表数量和所有水表的数量", notes="获取区域在线的水表数量和所有水表的数量")
    @GetMapping(value = "/findBgWaterWastedByArea")
    @ResponseStatus(HttpStatus.OK)
    public List<BgAreaWaterUsageAndPayAmount> findOnlineWater() {
        return bgAreaWaterUsageAndPayAmountService.findAll();
    }
}
