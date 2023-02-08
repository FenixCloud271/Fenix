package com.example.fenixuser.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface testMapper {
    String getName(@Param("id") Integer id);
}
