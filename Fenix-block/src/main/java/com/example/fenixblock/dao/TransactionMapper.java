package com.example.fenixblock.dao;

import entity.TransactionVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TransactionMapper {
    List<TransactionVO> getTxHash(@Param("fromAddress") List<String> fromAddress);

}
