package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Se esta activando el evento ApplicationStartingEvent");
        System.out.println(event.getBootstrapContext().toString());
    }
}
