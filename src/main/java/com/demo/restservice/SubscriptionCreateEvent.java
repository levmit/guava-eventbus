package com.demo.restservice;

public class SubscriptionCreateEvent {

    private String subscriptionId;

    public SubscriptionCreateEvent(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void execute(){
        System.out.println(this.getClass().getName() +subscriptionId);
    }
}