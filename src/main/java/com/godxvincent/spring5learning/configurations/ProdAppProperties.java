package com.godxvincent.spring5learning.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

//Esta etiqueta le dice a sprint que será un bean que debe enlazar las propiedades desde un archivo de configuración.
@ConfigurationProperties("app")
@Profile("prod")
public class ProdAppProperties extends AppProperties {
}
