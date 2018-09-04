package com.myspring.customer.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * created by xuyuan 18/9/3
 */
@Configuration
public class AMQConfig {

    @Bean
    public ActiveMQQueue activeMQQueue() {
        return new ActiveMQQueue("productQueue");
    }

    // 设置默认destination，需要显示装配
//    @Bean
//    public JmsMessagingTemplate jmsMessagingTemplate(ConnectionFactory connectionFactory) {
//        JmsMessagingTemplate jmsMessagingTemplate = new JmsMessagingTemplate();
//        jmsMessagingTemplate.setConnectionFactory(connectionFactory);
//        jmsMessagingTemplate.setDefaultDestinationName("productQueue");
//        return jmsMessagingTemplate;
//    }
}
