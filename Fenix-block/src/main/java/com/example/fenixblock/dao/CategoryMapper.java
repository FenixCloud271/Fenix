package com.example.fenixblock.dao;


import entity.CategoryVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryVO> getCategory();

    void removeCatrgory(@Param("idList") List<Integer> idList);
}
