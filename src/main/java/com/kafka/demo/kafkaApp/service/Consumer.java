package com.kafka.demo.kafkaApp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    
    @KafkaListener(topics = "TopicFirst", groupId = "foo")
    public String listen(String message) {
        System.out.println("Received Message in group foo: " + message);
        return "Received Message in group foo: " + message;
    }
}
