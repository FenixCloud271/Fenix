package com.example.fenixuser.service;

import com.example.fenixuser.dao.UserTxServiceMapper;
import com.example.fenixuser.vo.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserTxService {

    @Autowired
    UserTxServiceMapper userTxServiceMapper;

    public List<String> getUserAddressList(Integer userId) {
        List<UserAddress> userAddressList = userTxServiceMapper.getAllAddressById(userId);
        List<String> addressList = userAddressList.stream().map(UserAddress::getFromAddress).collect(Collectors.toList());
        return addressList;
    }
}
