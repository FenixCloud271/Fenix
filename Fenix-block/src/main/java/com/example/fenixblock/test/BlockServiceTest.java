package com.example.fenixblock.test;

import com.alibaba.fastjson.JSON;
import com.example.fenixblock.FenixBlockApplication;
import com.example.fenixblock.service.BlockService;
import entity.TransactionVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FenixBlockApplication.class)

public class BlockServiceTest {
    @Autowired
    BlockService blockService;

    @Test
    public void getTxByIdTest() {
        Integer userId = 1;
        List<TransactionVO> transactionList = blockService.getTxById(userId);
        String json = JSON.toJSONString(transactionList);
        System.out.println(json);
    }

}
