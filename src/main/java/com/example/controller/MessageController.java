package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.KafkaProducerService;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final KafkaProducerService producer;

    public MessageController(KafkaProducerService producer) {
        this.producer = producer;
    }

    @PostMapping
    public String sendMessage(@RequestParam String msg) {
        producer.sendMessage(msg);
        return "Message sent: " + msg;
    }
}
