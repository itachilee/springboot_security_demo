package com.reason.gsny.api.bg;

import com.reason.gsny.entity.dto.AreaDeviceOnlineAndAll;
import com.reason.gsny.service.bg.BgAreaCollectorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api/bg")
public class BgAreaCollectorApi {
    @Autowired
    private BgAreaCollectorService bgAreaCollectorService;

    @ApiOperation(value="获取区域在线的中继器数量和全部的中继器的数量", notes="获取区域在线的中继器数量和全部的中继器的数量")
    @GetMapping(value = "/findOnlineCollector")
    @ResponseStatus(HttpStatus.OK)
    public AreaDeviceOnlineAndAll findOnlineCollector() {
        return bgAreaCollectorService.findOnlineCollector();
    }
}
