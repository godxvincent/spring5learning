package com.godxvincent.spring5learning;

import com.godxvincent.spring5learning.listeners.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5learningApplication {

	public static void main(String[] args) {
		// Esta es una forma de definir el proyecto como una aplicación de spring creando un objeto
//		SpringApplication app = new SpringApplication(Spring5learningApplication.class);
//		app.run(args);
		// Cada evento se va a agregando y estos tienen un orden definido internamente.
		SpringApplication app = new SpringApplication(Spring5learningApplication.class);
		app.addListeners(
				new ApplicationStartingListener(),
				new ApplicationEnvironmentPreparedListener(),
				new ApplicationContextInitializedListener(),
				new ApplicationPreparedListener(),
				new ContextRefreshedListener(),
				new ApplicationStartedListener(),
				new AvailabilityChangeListener(),
				new ApplicationReadyListener(),
				new AvailabilityChangeListener(),
				new ApplicationFailedListener()
		);
		app.run(args);

	}

}
