package com.example.fenixblock.test;

import com.example.fenixblock.FenixBlockApplication;
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
@SpringBootTest(classes = FenixBlockApplication.class)
public class RedisTest {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void Stringtest(){
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        // 保存
        operations.set("testKey3", "testValue3" + UUID.randomUUID().toString());
        //
        String value = operations.get("testKey3");
        System.out.println("result: " + value);
    }
}
