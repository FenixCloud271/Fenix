package com.example.fenixblock.service;

import com.example.fenixblock.vo.transaction;
import com.example.fenixblock.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockService {
    @Autowired
    com.example.fenixblock.dao.transactionMapper transactionMapper;

    @Autowired
    UserFeign userFeign;

    // 根据 from 地址查找所有交易
    public List<transaction> getTxByFrom(List<String> fromAddress) {
        List<transaction> transactionList = transactionMapper.getTxHash(fromAddress);
        return transactionList;
    }

    // 根据 用户id 所有交易
    public List<transaction> getTxById(Integer userId){
        List<String> addressList = userFeign.getAddressById(userId);
        return getTxByFrom(addressList);
    }
}
