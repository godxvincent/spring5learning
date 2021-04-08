package com.godxvincent.spring5learning.components;

import com.godxvincent.spring5learning.configurations.AppProperties;
import com.godxvincent.spring5learning.configurations.EventListenerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostCommandRunner implements CommandLineRunner {

    // Aquí se inicia el bean AppProperties
    @Autowired
    private AppProperties appProperties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Esta ejecutandose una clase que ejecuta comandos una vez, justo luego de iniciar el .run de la aplicación");
        System.out.println("Esto es una prueba===> "+appProperties.isEnabled());
        System.out.println("Esto es una prueba===> "+appProperties.getRemoteAddress().toString());


        // Este if es solo para evitar el warning al hacer el push.
        if (args.length>0) {
            if (args[0].equals("")) {
                throw new Exception("");
            }
        }
    }
}
