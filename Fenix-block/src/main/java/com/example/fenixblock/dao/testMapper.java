package com.example.fenixblock.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface testMapper {
    List<String> getTxHash(@Param("heigh") Integer heigh);
}
