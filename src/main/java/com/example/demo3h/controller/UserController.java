package com.example.demo3h.controller;

import com.example.demo3h.model.JsonResult;
import com.example.demo3h.model.TbUserInfo;
import com.example.demo3h.service.Impl.TbUserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private TbUserInfoServiceImpl tbUserInfoServiceImpl;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList(){
     JsonResult  r = new JsonResult();
     try {
         List<TbUserInfo> userList  = tbUserInfoServiceImpl.findAll();
         r.setResult(userList);
         r.setStatus("ok");
     }catch (Exception e){
         r.setResult(e.getClass().getName()+":"+e.getMessage());
          r.setStatus("error");
     }
        return ResponseEntity.ok(r);
    }
    @RequestMapping("/demo")
    public  String demo(Model model){
        List<TbUserInfo> list =tbUserInfoServiceImpl.findAll();
        model.addAttribute("list",list);
        return  "/index";
    }
    @RequestMapping("/del")
    public  String delete(int id){
         int count=tbUserInfoServiceImpl.del(id);
         if(count>0){
             return  "redirect:/demo";
         }else {
             return "/404";
         }
    }
    @RequestMapping("/insert")
    public  String Insert(){

        return "user";
    }
    @RequestMapping("/star")
    public  String Star(){

        return "star";
    }
    @RequestMapping("/add")
    public  String  add(TbUserInfo userInfo){
        int count=tbUserInfoServiceImpl.add(userInfo);
        if (count>0){
            tbUserInfoServiceImpl.find();
            return  "redirect:/demo";
        }
        return  "insert";
    }
    @RequestMapping("/update")
    public  String update(TbUserInfo userInfo){
        int count=tbUserInfoServiceImpl.upadate(userInfo);
        if (count>0){
            tbUserInfoServiceImpl.find();
            return  "redirect:/demo";
        }
        return  "admin";
    }

    @RequestMapping("/findById")
    public  String findById(int id,Model model){
        TbUserInfo userInfo= tbUserInfoServiceImpl.findById(id);
        model.addAttribute("userInfoList",userInfo);
       return  "admin";
    }

}
