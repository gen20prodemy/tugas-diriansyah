package com.prodemy.kafkalistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodemy.kafkalistener.service.MessageConsumer;

@SpringBootApplication
public class KafkalistenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkalistenerApplication.class, args);
		MessageConsumer messageConsumer = new MessageConsumer();
		messageConsumer.listen(null);
	}

}
