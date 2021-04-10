package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

public class AvailabilityChangeListener implements ApplicationListener<AvailabilityChangeEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;


    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isAvailabilityChangeListenerEnabled()) {
            System.out.println("Se esta activando el evento AvailabilityChangeEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el AvailabilityChangeListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
