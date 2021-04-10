package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;


    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isApplicationPreparedListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationPreparedEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationPreparedListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
