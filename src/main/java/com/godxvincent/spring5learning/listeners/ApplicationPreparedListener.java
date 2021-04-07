package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        System.out.println("Se esta activando el evento ApplicationPreparedEvent");
        System.out.println(event.getSpringApplication().toString());
    }
}
