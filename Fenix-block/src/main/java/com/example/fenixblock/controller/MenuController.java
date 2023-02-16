package com.example.fenixblock.controller;

import com.example.fenixblock.service.CategoryService;
import entity.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utils.Result;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/getMenu")
    public Result getMenu() {
        List<CategoryVO> categoryVOList = categoryService.getcategoryTree();
        return Result.ok().setData(categoryVOList);
    }
    @RequestMapping("/deleteMenu")
    public Result deleteCatById(@RequestParam int[] catId) {
        categoryService.removeCatById(catId);
        return Result.ok();
    }
}
