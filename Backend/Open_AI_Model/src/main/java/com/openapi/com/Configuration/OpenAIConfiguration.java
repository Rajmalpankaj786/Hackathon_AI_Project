package com.openapi.com.Configuration;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class OpenAIConfiguration implements WebMvcConfigurer{
	@Value("${openai.api.key}")
	String OpenApiKey;
	
//	 @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	        registry.addMapping("/**")
//	                .allowedOrigins("http://localhost:3000") // Replace with your frontend URL
//	                .allowedMethods("GET", "POST", "PUT", "DELETE");
//	    }


	
	@Bean
	@Qualifier("openaiRestTemplate")
	public RestTemplate template() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getInterceptors().add((request,body,execution) -> {
			
			request.getHeaders().add("Authorization", "Bearer " + OpenApiKey);

			
			return execution.execute(request,body);
		});
		//System.out.print(restTemplate);
		return restTemplate;
		
		
	}

}
