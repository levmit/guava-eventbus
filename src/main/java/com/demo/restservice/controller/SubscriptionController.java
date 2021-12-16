package com.demo.restservice.controller;

import com.demo.restservice.AppEventBus;
import com.demo.restservice.SubscriptionCreateEvent;
import com.demo.restservice.SubscriptionUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubscriptionController {

    @Autowired
    AppEventBus eventBus;

    @PutMapping("/subscription/{id}")
    public void update(@PathVariable(value = "id") String id) {
        eventBus.post(new SubscriptionUpdateEvent(id));
    }

    @PostMapping("/subscription")
    public void create(@RequestParam String id) {
        eventBus.post(new SubscriptionCreateEvent(id));
    }
}