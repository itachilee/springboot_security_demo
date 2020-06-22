package com.reason.gsny.api;

import com.reason.gsny.entity.TreeEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon
 */
@RestController
@RequestMapping("/api")
public class TreeApi {

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @GetMapping(value = "/tree")
    @ResponseStatus(HttpStatus.OK)
    public List<TreeEntity> getUserList()
    {
        TreeEntity tree = new TreeEntity();
        tree.setId(1);
        tree.setText("id1");
        List<TreeEntity> list=new ArrayList<TreeEntity>();
        list.add(tree);
        return list;
    }
}
