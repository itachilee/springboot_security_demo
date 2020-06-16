package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.service.bg.BgAreaDeviceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bg")
public class BgAreaDeviceApi {
    @Autowired
    private BgAreaDeviceService bgAreaDeviceService;

    @ApiOperation(value="获取区域设备信息", notes="获取区域设备信息")
    @GetMapping(value = "/areaDevices")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<BgAreaDevice> getGprsList(@RequestParam(value="page", defaultValue="0") int page,
                                              @RequestParam(value="size", defaultValue="100") int size)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<BgAreaDevice> lists=  bgAreaDeviceService.findAll(pageable);
        return lists;
    }


    @ApiOperation(value="获取设备信息", notes="获取用户信息")
    @GetMapping(value = "/findDeviceGroupByArea")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaDeviceGroup> findUserGroupByArea()
    {
        List<AreaDeviceGroup> lists=  bgAreaDeviceService.findDeviceGroupByArea();
        return lists;
    }

}
