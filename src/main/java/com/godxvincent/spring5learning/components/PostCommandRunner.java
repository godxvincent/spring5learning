package com.godxvincent.spring5learning.components;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PostCommandRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Esta ejecutandose una clase que ejecuta comandos una vez, justo luego de iniciar el .run de la aplicación");
        if (args.length>0) {
            if (args[0].equals("")) {
                throw new Exception("");
            }
        }
    }
}
