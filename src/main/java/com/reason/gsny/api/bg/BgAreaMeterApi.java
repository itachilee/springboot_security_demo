package com.reason.gsny.api.bg;

import com.reason.gsny.entity.dto.AreaMeter;
import com.reason.gsny.service.bg.BgAreaMeterService;
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
public class BgAreaMeterApi {
    @Autowired
    BgAreaMeterService bgAreaMeterService;

    @ApiOperation(value="获取区域在线的阀控器数量", notes="获取区域在线的阀控器数量")
    @GetMapping(value = "/findOnlineMeter")
    @ResponseStatus(HttpStatus.OK)
    public AreaMeter findOnlineMeter() {
        return bgAreaMeterService.findOnlineMeter();
    }
}
