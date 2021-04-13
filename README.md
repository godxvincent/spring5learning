# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.4/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Notas del aprendizaje
* [Link de referencia comando gradle](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-running-with-the-gradle-plugin)
* *gradle bootRun*
Nota: A menos que se tenga el plugin basico de java instalado se debe correr este comando de lo contrario se debe ejecutar el comando *gradle run*.
* Spring tiene unos eventos durante la fase de inicialización por lo general no se requiere su modificación pero es bueno saber que allí se encuentran. [Eventos](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-application-events-and-listeners)  
* Al manejar profiles con las clases de configuraciones se debe tener archivos de configuración por aparte siguiendo la nomenclatura de `application-{profile}.yml`
* Es posible habilitar que los logs se presenten con colores si la consola lo soporta [colores en los logs](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-logging)
* La anotación @Bean sirve para decirle al contenedor de spring que cierto bean debe ser instanciado a través de un metodo que hace alguna cosa personalizada mas info [aqui](https://zetcode.com/springboot/bean/)
* El operador `::` es utilizado para hacer referencia a una función ejemplo esto ejecuta la función `Math.max(4, 6)` esto hace referencia la función max `Math::max` y se usa en la programación con funciones lambdas. Más info [aqui](https://stackovernet.xyz/es/q/5626743)
* [Propiedades de spring](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties)
