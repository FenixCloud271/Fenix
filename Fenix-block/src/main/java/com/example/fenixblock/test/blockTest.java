package com.example.fenixblock.test;

import com.alibaba.fastjson.JSON;
import com.example.fenixblock.FenixBlockApplication;
import com.example.fenixblock.service.BlockService;
import com.example.fenixblock.service.BlockTestService;
import com.example.fenixblock.vo.TestVO;
import com.example.fenixblock.vo.transaction;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FenixBlockApplication.class)

public class blockTest {
    @Autowired
    BlockTestService blockTestService;

    @Autowired
    BlockService blockTest;

    @Test
    public void getTxhash() {
        Integer heigh = 100;
        List<String> txhashList = blockTestService.getTxHashTest(heigh);
        System.out.println(txhashList);
    }

    @Test
    public void getTx() {
        String fromAddress = "0x2cb43dc86d50ce889b08bb2c00b4f659c150ffa4";
        List<String> addressList = new ArrayList<>();
        addressList.add(fromAddress);
        List<transaction> txList = blockTest.getTxByFrom(addressList);
        System.out.println("txList:");
        String json = JSON.toJSONString(txList);
        System.out.println(json);
    }

    @Test
    public void getTxById(){
        Integer id = 1;

    }

    @Test
    public void jsonTest() {
        TestVO testVO = new TestVO();
        testVO.setId(00);
        testVO.setName("Sam");
        String json = JSON.toJSONString(testVO);
        System.out.println(json);
    }

    @Test
    public void pubKeyTest() {

    }
}
