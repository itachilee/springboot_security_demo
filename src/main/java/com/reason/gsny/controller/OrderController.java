package com.reason.gsny.controller;

import com.reason.gsny.entity.TableToConcentratorEntity;
import com.reason.gsny.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

        @Autowired
        private OrderService orderService;
    @GetMapping("/orders")
    public ModelAndView getListByStatus(Model model,
                                        @RequestParam(value="page", defaultValue="0") int page,
                                        @RequestParam(value="size", defaultValue="10") int size ) {
        Sort sort = new Sort(Sort.Direction.DESC, "sendId");
        Pageable pageable = PageRequest.of(page, size, sort);
        Iterable<TableToConcentratorEntity> lists=  orderService.findAll(pageable);
        model.addAttribute("lists",lists);
        return  new ModelAndView("order/show");
    }
}
