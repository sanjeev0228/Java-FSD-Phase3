package com.javabydeveloper.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.javabydeveloper.service.MessageService;

@SpringBootTest
class SpringBootJunit5ExampleApplicationTests {
	@Autowired
	private MessageService messageService;
	
	@Test
	@DisplayName("Subscription message service")
	void testSubscriptionMessage() {
	
			String user ="Peter";
			
			String message = messageService.getSubscription(user);
			assertEquals("Hello "+user+", Thanks for the subscription!", message);
		}
			
		}
	
	
	


