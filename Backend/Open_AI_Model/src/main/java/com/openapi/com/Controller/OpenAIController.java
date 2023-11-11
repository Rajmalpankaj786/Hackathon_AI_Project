package com.openapi.com.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.openapi.com.Model.ChatGptRequest;
import com.openapi.com.Model.ChatGptResponse;

import lombok.extern.slf4j.Slf4j;







@RestController
@RequestMapping(value = "/AI_Model")
@CrossOrigin(origins = "http://localhost:3000")
@Slf4j
public class OpenAIController {
	@Value("${openai.model}")
	private String model;
	
	@Value("${openai.api.url}")
	private String apiURL;
	
	@Autowired
	private RestTemplate template;
	
	
	@GetMapping("/chat")
	public String chat(@RequestParam("prompt")  String prompt) {
		log.info("Inside GetMapping chat method");
		 ChatGptRequest request= new ChatGptRequest(model, prompt);
		
	ChatGptResponse	chatGptResponse= template.postForObject(apiURL, request, ChatGptResponse.class);
	
	return chatGptResponse.getChoices().get(0).getMessage().getContent();
		 
		 
	}



}