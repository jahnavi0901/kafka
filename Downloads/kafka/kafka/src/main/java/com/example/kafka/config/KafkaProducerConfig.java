package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
	
	
	@Bean
	public NewTopic createTopic() {
		return new NewTopic("javademo-newtopic",10,(short)1);
		//replication factor can't be greater than 5 
	}

}
