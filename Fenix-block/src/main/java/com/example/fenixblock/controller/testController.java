package com.example.fenixblock.controller;

import com.example.fenixblock.service.BlockTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/blockTest")
@RestController
public class testController {
    @Autowired
    BlockTestService blockTestService;

    @GetMapping("/tx")
    public List<String> getTxHashTest() {
        Integer heigh = 100;
        return blockTestService.getTxHashTest(heigh);
    }
}
