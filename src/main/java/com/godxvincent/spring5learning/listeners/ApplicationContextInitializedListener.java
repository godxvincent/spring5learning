package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationContextInitializedListener implements ApplicationListener<ApplicationContextInitializedEvent> {
    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {
        System.out.println("Se esta activando el evento ApplicationContextInitializedEvent");
        System.out.println(event.getSpringApplication().toString());
    }
}
