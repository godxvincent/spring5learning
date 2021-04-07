package com.godxvincent.spring5learning.listeners;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

public class WebServerInitializedListener implements ApplicationListener<WebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        System.out.println("Se esta activando el evento WebServerInitializedEvent");
        System.out.println(event.getTimestamp());
    }
}
