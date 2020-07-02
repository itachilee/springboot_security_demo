package com.reason.gsny.api.bg;

import com.reason.gsny.entity.dto.AreaWaterUsage;
import com.reason.gsny.service.bg.BgAreaPaymentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
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
public class BgAreaPaymentApi {
    @Autowired
    private BgAreaPaymentService bgAreaPaymentService;

    @ApiOperation(value="获取区域所有按年月分组的充值水量信息", notes="获取区域所有按年月分组的充值水量信息")
    @GetMapping(value = "/findPaymentByDate")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaWaterUsage> findPaymentByDate()
    {
        return bgAreaPaymentService.findPaymentByDate();
    }

}
