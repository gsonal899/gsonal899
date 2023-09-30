package com.example.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class AccountServiceApplication
{
	
//    @Bean
//	public WebClient webClient()
//	{
//		return WebClient.builder().build();
//	}
	
	public static void main(String[] args)
	{
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
