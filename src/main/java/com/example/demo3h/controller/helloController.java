package com.example.demo3h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class helloController {

    /**
     * 主界面
     * */
    @RequestMapping("/hello")
    public  String hello(){

        return "index";
    }
    /**
     * 兼职界面
     * */
    @RequestMapping("/part")
    public  String part(){

        return "part";
    }
    /**
     * 全职界面
     * */
    @RequestMapping("/full")
    public  String full(){

        return "full";
    }
    /**
     * 二手市场界面
     * */
    @RequestMapping("/second")
    public  String second(){

        return "second";
    }


    /**
    * 互帮互助界面
    * */
    @RequestMapping("/help")
    public  String help(){

        return "help";
    }
    /**
     * 详情界面
     * */
    @RequestMapping("product")
    public String  product(){

        return "product";
    }








}
