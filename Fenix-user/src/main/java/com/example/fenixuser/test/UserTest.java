package com.example.fenixuser.test;

import com.example.fenixuser.FenixUserApplication;
import com.example.fenixuser.service.userTestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FenixUserApplication.class)
public class UserTest {

    @Autowired
    userTestService userTestService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void getNameTest() {
        Integer id = 1;
        String name = userTestService.getUserTest(id);
        System.out.println(name);
    }

    @Test
    public void redisTest() {
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        // 保存
        operations.set("testKey2", "testValue2" + UUID.randomUUID().toString());
        //
        String value = operations.get("testKey2");
        System.out.println("result: " + value);
    }

}
