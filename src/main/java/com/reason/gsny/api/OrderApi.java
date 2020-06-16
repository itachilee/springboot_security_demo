package com.reason.gsny.api;


import com.reason.gsny.entity.TableToConcentratorEntity;
import com.reason.gsny.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 命令监控api
 * @author leon
 */
@RestController
@RequestMapping("/api/v1")
public class OrderApi {
    @Autowired
    private OrderService orderService;

    @ApiOperation(value="获取未执行完成命令监控列表", notes="获取未执行完成监控列表")
    @GetMapping("/ordersNotOver")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableToConcentratorEntity> getOrderListByStatus(
                                  @RequestParam(value="page", defaultValue="0") int page,
                                  @RequestParam(value="size", defaultValue="100") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableToConcentratorEntity> lists=  orderService.findAllByIsOverIsLessThan(pageable,4);
        return lists;
    }

    @ApiOperation(value="获取命令监控列表", notes="获取命令监控列表")
    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableToConcentratorEntity> getOrderList(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="100") int size ) {
        Sort sort = new Sort(Sort.Direction.DESC, "sendId");
        Pageable pageable = PageRequest.of(page, size, sort);
        Iterable<TableToConcentratorEntity> lists=  orderService.findAll(pageable);
        return lists;
    }


    @ApiOperation(value="获取命令监控列表", notes="获取命令监控列表")
    @GetMapping("/ordersIsOver")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<TableToConcentratorEntity> getOrderIsOverList(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="100") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableToConcentratorEntity> lists=  orderService.findAllByIsOverEquals(pageable,4);
        return lists;
    }

    @ApiOperation(value="通过命令序号获取命令监控列表", notes="通过命令序号获取命令监控列表")
    @GetMapping("/getOrderBySendId/{sendId}")
    @ResponseStatus(HttpStatus.OK)
    public TableToConcentratorEntity getOrderBySendId(@PathVariable long sendId) {

        return  orderService.findBySendId(sendId);
    }
}
