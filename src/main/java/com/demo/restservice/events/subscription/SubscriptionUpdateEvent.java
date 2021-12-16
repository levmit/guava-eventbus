package com.demo.restservice.events.subscription;

public class SubscriptionUpdateEvent {

    private String subscriptionId;

    public SubscriptionUpdateEvent(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void execute(){
        System.out.println(this.getClass().getName() +subscriptionId);
    }
}
