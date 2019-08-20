package com.lwuhan.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wuhan
 * @Date: 2019/8/20 00:09
 * @Description:
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){return "index";}
}
