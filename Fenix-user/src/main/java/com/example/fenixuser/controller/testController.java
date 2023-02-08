package com.example.fenixuser.controller;

import com.example.fenixuser.feign.feignTest;
import com.example.fenixuser.service.userTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/userTest")
@RestController
public class testController {

    @Autowired
    userTestService userTestService;
    @Autowired
    feignTest feignTest;
    @Value("${Sam.age}")
    String configName;

    @GetMapping("/user")
    public String test() {
        Integer id = 1;
        String name = userTestService.getUserTest(id);
        return name;
    }

    @GetMapping("/block")
    public List<String> feignTest() {
        return feignTest.getTxHashTest();
    }

    @GetMapping("/config")
    public String configTest() {

        return configName;
    }
}
