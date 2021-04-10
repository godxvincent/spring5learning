package com.godxvincent.spring5learning.listeners;

import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

// https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-application-events-and-listeners
// Para implementar un listener de los eventos de spring se crea una clase que implemente ApplicationListener el cual recibe
// un tipo generico del tipo de evento que espera se implemente.
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private EventListenerProperties eventListenerProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (eventListenerProperties != null && eventListenerProperties.isContextRefreshedListenerEnabled()) {
            System.out.println("Se esta activando el evento ContextRefreshedEvent");
        } else {
            if (eventListenerProperties == null) {
                System.out.println("En el ContextRefreshedListener aun no se cargan las propiedades EventListenerProperties");
            }
        }
    }
}
