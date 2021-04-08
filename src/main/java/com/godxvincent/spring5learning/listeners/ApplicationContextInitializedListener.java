package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationContextInitializedListener implements ApplicationListener<ApplicationContextInitializedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ApplicationContextInitializedEvent event) {

        System.out.println("Se esta activando el evento ApplicationContextInitializedEvent");
        System.out.println(event.getSpringApplication().toString());

    }
}
