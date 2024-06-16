package com.example.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {
	
	Logger log =LoggerFactory.getLogger(KafkaMessageListener.class);
	
	
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume(String msg) {
		log.info("Consumer is sonsuming msg:{}",msg);
	}
	
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume1(String msg) {
		log.info("Consumer is sonsuming msg:{}",msg);
	}

	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume2(String msg) {
		log.info("Consumer is sonsuming msg:{}",msg);
	}
	
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume3(String msg) {
		log.info("Consumer3 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume4(String msg) {
		log.info("Consumer4 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume5(String msg) {
		log.info("Consumer5 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume6(String msg) {
		log.info("Consumer6 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume7(String msg) {
		log.info("Consumer7 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume8(String msg) {
		log.info("Consumer8 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume9(String msg) {
		log.info("Consumer9 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume10(String msg) {
		log.info("Consumer10 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume11(String msg) {
		log.info("Consumer11 is sonsuming msg:{}",msg);
	}
	@KafkaListener(topics="javademo-newtopic",groupId="java-data")
	public void consume12(String msg) {
		log.info("Consumer12 is sonsuming msg:{}",msg);
	}



}
