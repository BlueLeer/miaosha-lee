package com.lee.miaosha.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lee
 * @date 2020/1/3 17:08
 */
@Controller
@Slf4j
public class IndexController {
    @GetMapping(value = {"","/index"})
    public String index(){
        return "index";
    }
    
    public 
}
