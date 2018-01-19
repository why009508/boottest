package com.jk.controller;

import com.jk.pojo.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.lang.System.out;


@Controller
@EnableAutoConfiguration
public class UserController {
    private UserService userService;
    @RequestMapping("/home")
    public String home() {
        return "../main/login";
    }

    @RequestMapping("queryUser")
    public String queryUser(){
        /*List<User> list = userService.queryUser();*/
        System.out.println("1322121212121212121");
        return "reg";
    }
    @RequestMapping("/hello/{myName}")
    @ResponseBody
    public String index(@PathVariable String myName) {
        return "Hello "+myName+"!!!";
    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
