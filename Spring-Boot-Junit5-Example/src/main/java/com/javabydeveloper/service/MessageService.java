package com.javabydeveloper.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	public String getSubscription (String user) {
		return "Hello "+user+" ,THANKS FOR THE SUBSCRIPTION!";
	}

}
