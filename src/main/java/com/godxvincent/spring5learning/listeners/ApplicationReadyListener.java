package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("Se esta activando el evento ApplicationReadyEvent");
        System.out.println(event.getTimestamp());
    }
}
