package com.example.fenixblock.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.example.fenixblock.dao.TransactionMapper;
import entity.TransactionVO;
import com.example.fenixblock.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Result;

import java.util.List;

@Service
public class BlockService {
    @Autowired
    TransactionMapper transactionMapper;

    @Autowired
    UserFeign userFeign;

    // 根据 from 地址查找所有交易
    public List<TransactionVO> getTxByFrom(List<String> fromAddress) {
        List<TransactionVO> transactionList = transactionMapper.getTxHash(fromAddress);
        return transactionList;
    }

    // 根据 用户id 所有交易
    public List<TransactionVO> getTxById(Integer userId){
        Result result = userFeign.getAddressById(userId);
        List<String> addressList = result.getData(new TypeReference<List<String>>(){});
        System.out.println("addressList:");
        System.out.println(JSON.toJSON(addressList));
        return getTxByFrom(addressList);
    }
}
