package com.reason.gsny.api.bg;

import com.reason.gsny.entity.dto.AreaWaterWasted;
import com.reason.gsny.repository.bg.BgWaterWastedRepo;
import com.reason.gsny.service.bg.BgWaterWastedService;
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
public class BgWaterWastedApi {
    @Autowired
    private BgWaterWastedService bgWaterWastedService;

    @ApiOperation(value="获取区域已开阀用水量", notes="获取区域已开阀用水量")
    @GetMapping(value = "/findBgWaterWastedByArea")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterWasted> findBgWaterWastedByArea(){
        return bgWaterWastedService.findBgWaterWastedByArea();
    }
}
