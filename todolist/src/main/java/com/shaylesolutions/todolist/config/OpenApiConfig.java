package com.shaylesolutions.todolist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
        .info(new Info().title("Todo List API")
        .description("An API that manage tasks on a Todo list.")
        .version("v1.0"));
    }    
}
