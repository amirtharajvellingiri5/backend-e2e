package com.example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "demo-topic", groupId = "springboot-group")
    public void consume(String message) {
        System.out.println("📥 Received: " + message);
    }
}
