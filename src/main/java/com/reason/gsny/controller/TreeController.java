package com.reason.gsny.controller;

import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.entity.TreeEntity;
import com.reason.gsny.repository.TableMeterRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/tree")
public class TreeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TreeController.class);

    @Autowired
    private TableMeterRepo tableMeterRepo;

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String tree(){

        return "/tree/tree";
    }


    @GetMapping("/data")
    @ResponseBody
    public List<TreeEntity> json() {
        TreeEntity tree = new TreeEntity();
        tree.setId(1);
        tree.setText("id1");
        List<TableMeterEntity> tableMeterEntities =tableMeterRepo.findAll();
        tree.setChildren(tableMeterEntities);
        List<TreeEntity> list=new ArrayList<TreeEntity>();
        list.add(tree);
        return list;
    }

    @GetMapping("/meters")
    public ResponseEntity<?> getList(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="10") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        return new ResponseEntity<Object>(tableMeterRepo.findAll(pageable), HttpStatus.OK);
    }
}
