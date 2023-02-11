package com.example.fenixblock.dao;


import com.example.fenixblock.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryVO> getCategory();
}
