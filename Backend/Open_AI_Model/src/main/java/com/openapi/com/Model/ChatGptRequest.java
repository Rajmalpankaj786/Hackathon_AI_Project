package com.openapi.com.Model;

import java.util.ArrayList;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ChatGptRequest {
	private String model;
	private List<Message> messages;
	public ChatGptRequest(String model, String prompt) {
	    super();
	    this.model = model;
	    this.messages = new ArrayList<>();
	    this.messages.add(new Message("user", prompt));
	}

	
}