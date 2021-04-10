package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvironmentPreparedListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {


        if (eventListenerProperties != null && eventListenerProperties.isApplicationEnvironmentPreparedListenerEnabled()) {
            System.out.println("Se esta activando el evento ApplicationEnvironmentPreparedEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ApplicationEnvironmentPreparedListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
