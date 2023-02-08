package com.example.fenixblock.test;

import com.example.fenixblock.FenixBlockApplication;
import com.example.fenixblock.vo.TestVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FenixBlockApplication.class)
public class MqTest {

    @Autowired
    AmqpAdmin amqpAdmin;
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    // 创建Exchange Queue Binding
    public void exchangeTest() {
        DirectExchange directExchange = new DirectExchange("testExchange2", true, false);
        amqpAdmin.declareExchange(directExchange);
        System.out.println("Exchage创建成功");
    }

    @Test
    public void queueTest() {
        Queue queue = new Queue("testQueue2", true, false, false);
        amqpAdmin.declareQueue(queue);
        System.out.println("Queue创建成功");
    }

    @Test
    public void bindingTest() {
        Binding binding = new Binding("testQueue2", Binding.DestinationType.QUEUE, "testExchange2", "testKey2", null);
        amqpAdmin.declareBinding(binding);
        System.out.println("Binding创建成功");
    }

    @Test
    public void mesTest(){
        TestVO testVO = new TestVO();
        testVO.setId(1);
        testVO.setName("testName");
        rabbitTemplate.convertAndSend("testExhange2","testKey2",testVO);
    }
}
