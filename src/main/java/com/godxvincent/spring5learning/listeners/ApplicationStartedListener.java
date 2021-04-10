package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isApplicationStartedListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationStartedEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationStartedListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
