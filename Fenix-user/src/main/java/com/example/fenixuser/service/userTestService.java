package com.example.fenixuser.service;

import com.example.fenixuser.dao.testMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class userTestService {

    @Autowired
    testMapper testMapper;

    public String getUserTest(Integer id) {
        String name = testMapper.getName(id);
        return name;
    }
}
