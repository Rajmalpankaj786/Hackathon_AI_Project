package com.openapi.com.Model;

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
public class ChatGptResponse {

	
	private List<Choice> choices;
	
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	@ToString
	public static class Choice{
		private int index;
		private Message message;
		
	}
}