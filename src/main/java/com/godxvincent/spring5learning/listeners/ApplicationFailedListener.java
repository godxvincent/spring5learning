package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isApplicationFailedListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationFailedEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationFailedListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
