package com.example.fenixblock.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import utils.Result;

import java.util.List;

@FeignClient(name = "Fenix-user")
public interface UserFeign {
    @GetMapping("/userTx/getAddressById")
    public Result getAddressById(@RequestParam Integer userId);
}
