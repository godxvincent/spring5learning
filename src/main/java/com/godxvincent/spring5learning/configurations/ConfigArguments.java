package com.godxvincent.spring5learning.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

//https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-application-arguments
@Component
public class ConfigArguments {

    private final ApplicationArguments args;

    @Autowired
    public ConfigArguments(ApplicationArguments args) {
        this.args = args;
        System.out.println("Estos son las opciones con las que se ejecuto la aplicación");
        System.out.println(args.getNonOptionArgs());
    }
}
