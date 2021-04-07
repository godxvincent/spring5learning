package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Se esta activando el evento ApplicationStartedEvent");

        System.out.println(event.getSpringApplication().toString());
    }
}
