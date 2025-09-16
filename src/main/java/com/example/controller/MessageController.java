package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

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
