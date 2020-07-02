package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaDevice;
import com.reason.gsny.entity.dto.AreaDeviceGroup;
import com.reason.gsny.entity.dto.AreaDeviceGroup2;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.entity.general.R;
import com.reason.gsny.service.bg.BgAreaDeviceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 获取区域内设备相关信息·
 * @author leon
 */
@RestController
@RequestMapping("/api/bg")
public class BgAreaDeviceApi {
    @Autowired
    private BgAreaDeviceService bgAreaDeviceService;

    @ApiOperation(value="获取区域设备信息", notes="获取区域设备信息")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK",response = BgAreaDevice.class),
    })
    @GetMapping(value = "/areaDevices")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<BgAreaDevice> getGprsList(@RequestParam(value="page", defaultValue="0") int page,
                                              @RequestParam(value="size", defaultValue="100") int size)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<BgAreaDevice> lists=  bgAreaDeviceService.findAll(pageable);


        return lists;
    }

//    @ApiOperation(value="获取区域设备信息", notes="获取区域设备信息")
//    @ApiResponses({
//            @ApiResponse(code = 200,message = "OK",response = BgAreaDevice.class),
//    })
//    @GetMapping(value = "/areaDevices")
//    @ResponseStatus(HttpStatus.OK)
//    public R getGprsList(@RequestParam(value="page", defaultValue="0") int page,
//                                              @RequestParam(value="size", defaultValue="100") int size)
//    {
//        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
//        Iterable<BgAreaDevice> lists=  bgAreaDeviceService.findAll(pageable);
//
//        return R.ok().data("itms", lists).message("获取区域设备信息");
//    }


    @ApiOperation(value="获取设备信息", notes="获取设备信息")
    @GetMapping(value = "/findDeviceGroupByArea")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK",response = AreaDeviceGroup.class),
    })
    @ResponseStatus(HttpStatus.OK)
    public List<AreaDeviceGroup> findUserGroupByArea()
    {
        List<AreaDeviceGroup> lists=  bgAreaDeviceService.findDeviceGroupByArea();
        return lists;
    }

    @ApiOperation(value="按照设备类型获取设备月增长量", notes="按照设备类型获取设备月增长")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK",response = AreaDeviceGroup2.class),
    })
    @GetMapping(value = "/findDeviceByMonthAndDevice_type/{device_type}")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaDeviceGroup2> findDeviceByMonthAndDevice_type(@PathVariable long device_type)
    {
        List<AreaDeviceGroup2> lists=  bgAreaDeviceService.findDeviceByMonthAndDevice_type(device_type);
        return lists;
    }

    @ApiOperation(value="获取设备月增长量", notes="获取设备月增长量")
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK",response = AreaDeviceGroup2.class),
    })
    @GetMapping(value = "/findDeviceByMonth")
    @ResponseStatus(HttpStatus.OK)
    public Map<String,List<AreaDeviceGroup2>> findDeviceByMonth( )
    {
        return  bgAreaDeviceService.findDeviceByMonth();
    }


}
