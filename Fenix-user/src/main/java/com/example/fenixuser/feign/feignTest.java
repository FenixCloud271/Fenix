package com.example.fenixuser.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "Fenix-block")
public interface feignTest {
    @GetMapping("/blockTest/tx")
    public List<String> getTxHashTest();
}
