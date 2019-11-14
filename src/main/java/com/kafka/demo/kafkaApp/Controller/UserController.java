package com.kafka.demo.kafkaApp.Controller;

import com.kafka.demo.kafkaApp.service.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private final Producer producer;
    
    public UserController(Producer producer) {
        this.producer = producer;
    }
    
    @PostMapping("/kafka/publish")
    public void sendMessageToTopic(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
