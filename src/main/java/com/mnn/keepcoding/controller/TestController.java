package com.mnn.keepcoding.controller;

import com.mnn.keepcoding.domain.User;
import com.mnn.keepcoding.enums.SexEnum;
import com.mnn.keepcoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping("/insertUser/{userName}/{sexEnum}/{note}")
    public Map<String, Object> insertUser(@PathVariable("userName") String userName, @PathVariable("sexEnum") String sexEnum, @PathVariable("note") String note){
        User user = new User();
        user.setUserName(userName);
        user.setSex(SexEnum.MAIL);
        user.setNote(note);
        int success = userService.insertUser(user);
        Map<String,Object> result = new HashMap<>();
        result.put("success", success == 1);
        result.put("user", user);
        return result;
    }
}
