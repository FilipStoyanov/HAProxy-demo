package com.t212.accounts.positions.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.converter.MessageConverter;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;
import org.springframework.web.socket.messaging.SessionUnsubscribeEvent;


@Component
public class Executor {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private MessageConverter messageConverter;


    @EventListener
    public void handleSubscribeEvent(SessionSubscribeEvent event) {
        System.out.println("connected");
    }

    @EventListener
    public void handleUnsubscribeEvent(SessionUnsubscribeEvent event) {
        System.out.println("disconnected");
    }
}