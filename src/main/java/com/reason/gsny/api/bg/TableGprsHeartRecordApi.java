package com.reason.gsny.api.bg;

import com.reason.gsny.entity.bg.TableGprsHeartRecord;
import com.reason.gsny.entity.general.R;
import com.reason.gsny.repository.bg.TableGprsHeartRecordRepo;
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
public class TableGprsHeartRecordApi {
    @Autowired
    TableGprsHeartRecordRepo tableGprsHeartRecordRepo;

    @ApiOperation(value="查询所有的集中器登录事件", notes="查询所有的集中器登录事件")
    @GetMapping(value = "/findAllHeartRecord")
    @ResponseStatus(HttpStatus.OK)
    public R findAll(){
        return R.ok().data("item", tableGprsHeartRecordRepo.findAll()).message("查询所有的集中器登录事件");
    }
}
