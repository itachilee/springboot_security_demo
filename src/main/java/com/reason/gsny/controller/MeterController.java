package com.reason.gsny.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.service.MetersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 阀门控制器类
 * 处理开关阀信息
 * @author leon
 */
@Controller
public class MeterController {

    @Autowired
    private MetersService metersService;
    @GetMapping(value = "/openMeter")
    public ModelAndView openMeter(@RequestParam(value="id",defaultValue = "0") long id) throws JsonProcessingException {

        metersService.openMeter(id);
        return new ModelAndView("redirect:orders");
    }

    @GetMapping(value = "/closeMeter")
    public ModelAndView closeMeter(@RequestParam(value="id",defaultValue = "0") long id) throws JsonProcessingException {

        metersService.closeMeter(id);
        return new ModelAndView("redirect:orders");
    }
}
