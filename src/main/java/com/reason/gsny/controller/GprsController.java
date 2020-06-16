package com.reason.gsny.controller;

import com.reason.gsny.entity.TableGprsEntity;
import com.reason.gsny.entity.TableMeterEntity;
import com.reason.gsny.service.GprsService;
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
 * @author leon
 * 集中器控制器类
 */
@Controller
public class GprsController {

    @Autowired
    private GprsService gprsService;
    @Autowired
    private MetersService metersService;

//    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("/gprs")
    public String getList(Model model,
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="10") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableGprsEntity> lists=  gprsService.findAll(pageable);
        model.addAttribute("lists",lists);
        return "gprs/show";
    }

    @GetMapping("/gprsByStatus")
    public String getListByStatus(Model model,
                          @RequestParam(value="page", defaultValue="0") int page,
                          @RequestParam(value="size", defaultValue="10") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableGprsEntity> lists=  gprsService.findAllByStatus(pageable,"在线");
        model.addAttribute("lists",lists);
        return "gprs/show";
    }

//    @GetMapping("/showMeters/{id}")
    @GetMapping(value = "/showMeters")
    public String showMeters(Model model, @RequestParam(value="id",defaultValue = "0") long id,
                                   @RequestParam(value="page", defaultValue="0") int page,
                                   @RequestParam(value="size", defaultValue="10") int size ) {

        Pageable pageable = PageRequest.of(page, size, Sort.unsorted());
        Iterable<TableMeterEntity> lists=  metersService.findAllByImeiId(pageable,id);
        model.addAttribute("lists",lists);
        return "meters/show";
    }
}
