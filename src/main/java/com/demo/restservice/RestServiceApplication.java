package com.demo.restservice;

import com.demo.restservice.controller.SubscriptionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
