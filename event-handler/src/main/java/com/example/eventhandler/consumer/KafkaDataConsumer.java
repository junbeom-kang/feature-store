package com.example.eventhandler.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaDataConsumer implements DataConsumer {

    @KafkaListener(topics = "your-topic")
    public void consumeMessage(String message) {
        // 메시지 처리 로직을 구현합니다.
        System.out.println("Received message: " + message);
    }

}
