package com.demo.restservice.controller;

import com.demo.restservice.events.EventBusFactory;
import com.demo.restservice.events.subscription.SubscriptionCreateEvent;
import com.demo.restservice.events.subscription.SubscriptionUpdateEvent;
import com.google.common.eventbus.EventBus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SubscriptionController {

    EventBus eventBus = EventBusFactory.getEventBus();

    @PutMapping("/subscription/{id}")
    public void update(@PathVariable(value = "id") String id) {
        eventBus.post(new SubscriptionUpdateEvent(id));
    }

    @PostMapping("/subscription")
    public void create(@RequestParam String id) {
        eventBus.post(new SubscriptionCreateEvent(id));
    }
}
