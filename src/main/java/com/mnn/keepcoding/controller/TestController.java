package com.mnn.keepcoding.controller;

import com.mnn.keepcoding.domain.User;
import com.mnn.keepcoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${emp.code}")
    private String val;

    @ResponseBody
    @RequestMapping("/test")
    public String testMethod(){
        return "test spring boot" + "||" + this.val;
    }

    @Autowired
    private UserService userService = null;

    @ResponseBody
    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

}
