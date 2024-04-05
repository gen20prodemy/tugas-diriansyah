package com.prodemy.springbootjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private final String TOPIC = "test";

    public void sendMessage(String message){
        kafkaTemplate.send(TOPIC, message);
    }
}