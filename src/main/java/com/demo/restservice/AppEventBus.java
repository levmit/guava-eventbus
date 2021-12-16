package com.demo.restservice;

import com.google.common.eventbus.EventBus;
import org.springframework.stereotype.Component;

@Component
public class AppEventBus extends EventBus {

        public AppEventBus() {
            super.register(new SubscriptionEventListener());
        }
}