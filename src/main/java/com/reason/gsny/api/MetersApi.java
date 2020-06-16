package com.reason.gsny.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.service.MetersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author leon
 */
@Api(value="/阀控器接口", tags="阀控器")
@RestController
@RequestMapping("/api/v1")
public class MetersApi {
    @Autowired
    private MetersService metersService;

    @ApiOperation(value="获取集中器列表", notes="获取集中器列表")
    @GetMapping(value = "/closeMeter/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long closeMeter(@PathVariable("id") long id) throws JsonProcessingException {
          long sendId=  metersService.closeMeter(id);
        return sendId;
    }


    @ApiOperation(value="获取集中器列表", notes="获取集中器列表")
    @GetMapping(value = "/openMeter/{id}")
    @ResponseStatus(HttpStatus.OK)
    public long openMeter(@PathVariable("id") long id) throws JsonProcessingException {
        long sendId= metersService.openMeter(id);
        return sendId;
    }

    /**
     *
     * @param page 页数
     * @param size 页数据数
     * @param imeiid 集中器主键
     * @return Iterable 集中器下的阀控器列表
     */
    @ApiOperation(value="获取集中器下的阀控器列表", notes="获取集中器下的阀控器列表")
    @GetMapping(value = "/showMeters/{imeiid}")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableMeterEntity>  showMeters(
                                                  @RequestParam(value = "page", defaultValue = "0") int page,
                                                  @RequestParam(value = "size", defaultValue = "100") int size,
                                                  @PathVariable long imeiid) {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableMeterEntity> lists=  metersService.findAllByImeiId(pageable,imeiid);
        return lists;
    }

    /**
     * 查询所有阀控器
     * @param page
     * @param size
     * @return
     */
    @ApiOperation(value="查询所有阀控器", notes="查询所有阀控器")
    @GetMapping(value = "/allMeters")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableMeterEntity>  findAll(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "100") int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableMeterEntity> lists=  metersService.findAll(pageable);
        return lists;
    }
}
