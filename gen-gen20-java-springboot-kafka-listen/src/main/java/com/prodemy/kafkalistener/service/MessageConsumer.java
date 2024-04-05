package com.prodemy.kafkalistener.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    
    @KafkaListener(topics = "test", groupId = "group_id")
    public void listen(String message){
        System.out.println("Pesan: " + message);
    }
}
