package com.demo.restservice.events.subscription;

import com.google.common.eventbus.Subscribe;

public class SubscriptionEventListener {

    @Subscribe
    public void task(SubscriptionUpdateEvent subscriptionUpdateEvent) {
        subscriptionUpdateEvent.execute();
    }

    @Subscribe
    public void task(SubscriptionCreateEvent SubscriptionCreateEvent) {
        SubscriptionCreateEvent.execute();
    }
}
