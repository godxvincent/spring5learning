package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isApplicationReadyListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationReadyEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationReadyListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
