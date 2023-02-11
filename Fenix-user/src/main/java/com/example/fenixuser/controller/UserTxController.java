package com.example.fenixuser.controller;

import com.example.fenixuser.service.UserTxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import utils.Result;

import java.util.List;


@RequestMapping("/userTx")
@RestController
public class UserTxController {
    @Autowired
    UserTxService userTxService;

    @GetMapping("/getAddressById")
    public Result getAddressById(@RequestParam Integer userId) {
        List<String> addressList = userTxService.getUserAddressList(userId);
        return Result.ok().setData(addressList);
    }
}
