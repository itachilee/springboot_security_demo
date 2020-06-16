package com.reason.gsny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author leon
 */
@Controller
public class IndexController {

    @RequestMapping("/index.html")
    public String index() {
        return "/index";
    }

    @RequestMapping("/bg/index.html")
    public String bg() {
        return "/bg/index";
    }
}
