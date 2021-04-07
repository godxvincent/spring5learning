package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvironmentPreparedListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("Se esta activando el evento ApplicationEnvironmentPreparedEvent");
        System.out.println(event.getBootstrapContext().toString());
    }
}
