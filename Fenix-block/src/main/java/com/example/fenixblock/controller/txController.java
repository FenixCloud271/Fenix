package com.example.fenixblock.controller;

import com.example.fenixblock.service.BlockService;
import com.example.fenixblock.vo.transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import utils.Result;

import java.util.List;

@RequestMapping("/tx")
@RestController
public class txController {
    @Autowired
    BlockService blockService;

    @GetMapping("/getTxById")
    public Result getTxByAddress(@RequestParam Integer userId) {
        return Result.ok().setData(blockService.getTxById(userId));
    }
}
