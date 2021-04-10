package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isApplicationStartingListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationStartingEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationStartingListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
