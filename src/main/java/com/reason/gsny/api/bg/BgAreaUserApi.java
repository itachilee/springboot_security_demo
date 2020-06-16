package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.BgAreaUser;
import com.reason.gsny.entity.dto.AreaUserGroup;
import com.reason.gsny.service.bg.BgAreaUserService;
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
public class BgAreaUserApi {
    @Autowired
    private BgAreaUserService bgAreaUserService;

    @ApiOperation(value="获取区域用户信息", notes="获取区域用户信息")
    @GetMapping(value = "/areaUsers")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<BgAreaUser> getGprsList(@RequestParam(value="page", defaultValue="0") int page,
                                              @RequestParam(value="size", defaultValue="100") int size)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<BgAreaUser> lists=  bgAreaUserService.findAll(pageable);
        return lists;
    }

    @ApiOperation(value="获取区域用户信息", notes="获取区域用户信息")
    @GetMapping(value = "/findUserGroupByArea")
    @ResponseStatus(HttpStatus.OK)
    public List<AreaUserGroup> findUserGroupByArea()
    {
        List<AreaUserGroup> lists=  bgAreaUserService.findUserGroupByArea();
        return lists;
    }


}
