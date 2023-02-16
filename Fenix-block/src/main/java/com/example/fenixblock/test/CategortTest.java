package com.example.fenixblock.test;

import com.alibaba.fastjson.JSON;
import com.example.fenixblock.FenixBlockApplication;
import com.example.fenixblock.service.CategoryService;
import entity.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FenixBlockApplication.class)

public class CategortTest {
    @Autowired
    CategoryService categoryService;

    @Test
    public void getCategoryTest() {
        List<CategoryVO> categoryVOList = categoryService.getCategory();
        System.out.println("result:");
        System.out.println(JSON.toJSON(categoryVOList));
    }

    @Test
    public void getCategoryTreeTest() {
        List<CategoryVO> categoryVOList = categoryService.getcategoryTree();
        System.out.println("result:");
        System.out.println(JSON.toJSON(categoryVOList));
    }

    @Test
    public void removeCategory() {
        int id[] = {8};
        categoryService.removeCatById(id);
    }

}
