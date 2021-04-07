package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        System.out.println("Se esta activando el evento ApplicationFailedEvent");
        System.out.println(event.getTimestamp());
    }
}
