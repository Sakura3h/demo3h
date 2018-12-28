package com.example.demo3h.controller;

import com.example.demo3h.model.Porduct;
import com.example.demo3h.model.ProductType;
import com.example.demo3h.service.Impl.PorductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PorductController {
    @Resource
    PorductServiceImpl porductServiceImpl;
    /**
     * 二手市场界面
     * */
    @RequestMapping("/second")
    public  String second(Model model,Porduct porduct){
        List<Porduct> list =  porductServiceImpl.selectAll(porduct);
        List<ProductType> nameList = porductServiceImpl.selectNameAll();
        model.addAttribute("list",list);
        model.addAttribute("nameList",nameList);
        model.addAttribute("porduct",porduct);
        return "second";
    }
}
