package com.amy.cloud.amycloudapp.controller;

import com.amy.cloud.amycloudact.service.UserService;
import com.amy.cloud.amycloudapp.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    UserService userService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    @RequestMapping("/")
    public String index() {
        return userService.getUser();
    }

}