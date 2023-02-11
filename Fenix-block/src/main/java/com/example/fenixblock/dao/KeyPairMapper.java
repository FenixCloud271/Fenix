package com.example.fenixblock.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface KeyPairMapper {
    List<String> getKeyPairById(@Param("userId") Integer heigh);
}
