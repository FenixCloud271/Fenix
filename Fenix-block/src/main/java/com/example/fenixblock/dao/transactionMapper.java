package com.example.fenixblock.dao;

import com.example.fenixblock.vo.transaction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface transactionMapper {
    List<transaction> getTxHash(@Param("fromAddress") List<String> fromAddress);

}
