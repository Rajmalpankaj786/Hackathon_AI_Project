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



@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:3000")
public class OpenAIController {
	

}
