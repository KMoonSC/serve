package com.myspring.customer.service.impl;

import com.myspring.customer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * created by xuyuan 18/9/3
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    @Qualifier("activeMQQueue")
    private Destination activeMQQueue;

    @Scheduled(fixedDelay = 2000)    // 每2s执行1次
    public void send() {
        String product = "product" + System.currentTimeMillis();
        System.out.println("生产" + product);
        jmsMessagingTemplate.convertAndSend(activeMQQueue, product);
    }
}
