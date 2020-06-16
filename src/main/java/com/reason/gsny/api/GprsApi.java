package com.reason.gsny.api;

import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.entity.TreeEntity;
import com.reason.gsny.service.GprsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 集中器api
 * @author leon
 */
@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class GprsApi {
    @Autowired
    private GprsService gprsService;

    @ApiOperation(value="获取集中器列表", notes="获取集中器列表")
    @GetMapping(value = "/gprs")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableGprsEntity> getGprsList(@RequestParam(value="page", defaultValue="0") int page,
                                                 @RequestParam(value="size", defaultValue="100") int size, HttpServletResponse re)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableGprsEntity> lists=  gprsService.findAll(pageable);
        return lists;
    }

    @ApiOperation(value="获取在线的集中器列表", notes="获取在线的集中器列表")
    @GetMapping(value = "/gprsOnline")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableGprsEntity> getGprsOnlineList(  @RequestParam(value="page", defaultValue="0") int page,
                                                   @RequestParam(value="size", defaultValue="100") int size)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableGprsEntity> lists=  gprsService.findAllByStatus(pageable,"在线");
        return lists;
    }

    @ApiOperation(value="获取不在线的集中器列表", notes="获取不在线的集中器列表")
    @GetMapping(value = "/gprsOffline")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableGprsEntity> getGprsOfflineList(  @RequestParam(value="page", defaultValue="0") int page,
                                                         @RequestParam(value="size", defaultValue="100") int size)
    {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableGprsEntity> lists=  gprsService.findAllByStatus(pageable,"不在线");
        return lists;
    }


    @ApiOperation(value="通过集中器编号获取集中器", notes="通过集中器编号获取集中器")
    @GetMapping(value = "/gprsByImei/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TableGprsEntity getGprsByImei( @PathVariable long id)
    {
        return gprsService.findByImei(id);
    }

    @ApiOperation(value="更新集中器", notes="更新集中器")
    @PatchMapping(value = "/gprs/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateUser(@PathVariable("id") long id, @RequestBody TableGprsEntity tableGprsEntity)
    {
        gprsService.update(id, tableGprsEntity);
    }
}
