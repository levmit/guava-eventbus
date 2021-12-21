package com.demo.restservice;

import com.demo.restservice.events.EventBusFactory;
import com.demo.restservice.events.subscription.SubscriptionEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
        EventBusFactory.getEventBus().register(new SubscriptionEventListener());
    }
}
