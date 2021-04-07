package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

public class AvailabilityChangeListener implements ApplicationListener<AvailabilityChangeEvent> {

    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {
        System.out.println("Se esta activando el evento AvailabilityChangeEvent");
        System.out.println(event.getTimestamp());
    }
}
