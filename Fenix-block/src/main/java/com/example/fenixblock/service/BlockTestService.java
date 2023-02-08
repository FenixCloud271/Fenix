package com.example.fenixblock.service;

import com.example.fenixblock.dao.testMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class BlockTestService {

    @Autowired
    testMapper testMapper;

    /**
     *
     * @param heigh
     * @return
     */
    public List<String> getTxHashTest(Integer heigh){
        List<String> txHashList = testMapper.getTxHash(heigh);
        Map map = new HashMap();
        map.put("key1","value1");
        return txHashList;

    }
}
