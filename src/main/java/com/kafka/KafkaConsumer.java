package com.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "shivraj", groupId = "groupId", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(String message) {
        System.out.println("message = " + message);
    }
}
