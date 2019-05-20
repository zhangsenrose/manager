package com.eva.cn.web.base;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/")
    public String showLogin(){
        return "index";
    }

}
