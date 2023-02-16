package com.example.fenixblock.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fenixblock.dao.CategoryMapper;
import entity.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;


    public List<CategoryVO> getCategory() {
        return categoryMapper.getCategory();
    }

    // 获得树形结构
    public List<CategoryVO> getcategoryTree() {
        List<CategoryVO> categoryVOList = getCategory();
        List<CategoryVO> level1Menus = categoryVOList.stream().filter(categoryVO -> categoryVO.getParentId().equals(0)).map((menu) -> {
            menu.setChildren(getChildren(menu, categoryVOList));
            return menu;
        }).collect(Collectors.toList());
        return level1Menus;
    }

    // 递归找
    public List<CategoryVO> getChildren(CategoryVO root, List<CategoryVO> all) {
        List<CategoryVO> childrenList = all.stream().filter(categoryVO -> {
            return categoryVO.getParentId().equals(root.getId());
        }).map(categoryVO -> {
            categoryVO.setChildren(getChildren(categoryVO, all));
            return categoryVO;
        }).collect(Collectors.toList());
        return childrenList;
    }

    public void removeCatById(int[] catId){
       List idList = Arrays.stream(catId).boxed().collect(Collectors.toList());
        categoryMapper.removeCatrgory(idList);
    }
}
