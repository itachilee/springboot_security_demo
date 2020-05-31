package com.reason.gsny.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reason.gsny.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;


/**
 * @author leon
 * @date 2020-5-18
 */
@Controller
public class MainController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
//    @Controller
//    public class ThymeleafController {
//
//
//    }
    @Autowired
    ObjectMapper mapper;
    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "index";
    }
    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }
    @GetMapping("/cards")
    public String cards() {
        return "/cards";
    }
    @GetMapping("/json")
    @ResponseBody
    public User json() {
        User user = new User();
        user.setUserName("mrbird");
        user.setBirthday(new Date());
        return user;
    }


    /**
     * 序列化
     * @return
     */
    @RequestMapping("serialization")
    @ResponseBody
    public String serialization() {
        try {
            User user = new User();
            user.setUserName("mrbird");
            user.setBirthday(new Date());
            String str = mapper.writeValueAsString(user);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 反序列化
     * 树遍历
     * @return
     */
    @RequestMapping("readjsonstring")
    @ResponseBody
    public String readJsonString() {
        try {
//            String json = "{\"name\":\"mrbird\",\"age\":26}";
//            JsonNode node = this.mapper.readTree(json);
//            String name = node.get("name").asText();
//            int age = node.get("age").asInt();
            String json = "{\"name\":\"mrbird\",\"hobby\":{\"first\":\"sleep\",\"second\":\"eat\"}}";;
            JsonNode node = this.mapper.readTree(json);
            JsonNode hobby = node.get("hobby");
            String first = hobby.get("first").asText();
            return first;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 绑定对象
     * @return
     */
    @RequestMapping("readjsonasobject")
    @ResponseBody
    public String readJsonAsObject() {
        try {
            String json = "{\"name\":\"mrbird\",\"age\":26}";
            User user = mapper.readValue(json, User.class);
            String name = user.getUserName();
            int age = user.getAge();
            return name + " " + age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}