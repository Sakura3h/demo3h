package com.example.demo3h.controller;

import com.example.demo3h.model.BusinessInfo;
import com.example.demo3h.service.Impl.BusinessInfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Demo class
 *  生活服务界面
 * @author 刘恒
 * @date 2018/12/28
 */
@Controller
public class ServiceController {
    @Resource
    private  BusinessInfoServiceImpl businessInfoServiceImpl;


    @RequestMapping("/service")
    public  String Service(Model model){
        List<BusinessInfo> listInfo = businessInfoServiceImpl.findBusinessInfoResultMap();
        model.addAttribute("listInfo",listInfo);
        return "service";
    }
    @RequestMapping("/")
    public  String find(){

        return  "";
    }
}
