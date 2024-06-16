package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.service.KafkaMessagePublisher;

@RestController
@RequestMapping("/producer")
public class EventController {
	
	
	@Autowired
	private KafkaMessagePublisher publisher;
	
	
	@GetMapping("/publish/{msg}")
	public ResponseEntity<?> publishMessgae(@PathVariable String msg){
		try {
			System.out.println("about to send 1");
			  for (int i = 0; i <= 100000; i++) {
	                publisher.sendMsgToTopic(msg);
	            }
		System.out.println("about to send 2");
		return ResponseEntity.ok("msg sent successfully");}
		catch(Exception ex){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
					
		}
	}

}
