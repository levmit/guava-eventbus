package com.demo.restservice;

public class SubscriptionUpdateEvent {

    private String subscriptionId;

    public SubscriptionUpdateEvent(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void execute(){
        System.out.println(this.getClass().getName() +subscriptionId);
    }
}
