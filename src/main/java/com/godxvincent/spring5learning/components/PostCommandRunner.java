package com.godxvincent.spring5learning.components;

import com.godxvincent.spring5learning.configurations.AppProperties;
import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class PostCommandRunner implements CommandLineRunner {

    // Aquí se inicia el bean AppProperties
    @Autowired
    private AppProperties appProperties;

    @Autowired
    private EventListenerProperties eventListenerProperties;

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Esta ejecutandose una clase que ejecuta comandos una vez, justo luego de iniciar el .run de la aplicación");
        System.out.println("Esto es una prueba===> "+appProperties.isEnabled());
        System.out.println("Esto es una prueba===> "+appProperties.getRemoteAddress().toString());
        System.out.println("Esto es una prueba 2===> "+eventListenerProperties.isApplicationContextInitializedListenerEnabled());

        LOGGER.debug("This is a debug message");
        LOGGER.info("This is an info message");
        LOGGER.warn("This is a warn message");
        LOGGER.error("This is an error message");


        // Este if es solo para evitar el warning al hacer el push.
        if (args.length>0) {
            if (args[0].equals("")) {
                throw new Exception("");
            }
        }
    }
}
