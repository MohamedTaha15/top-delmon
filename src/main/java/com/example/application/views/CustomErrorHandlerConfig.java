package com.example.application.views;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vaadin.flow.server.VaadinServiceInitListener;

@Configuration
class CustomErrorHandlerConfig {

    @Bean
    public VaadinServiceInitListener vaadinServiceInitListener() {
        return event -> event.getSource().addSessionInitListener( 
            e -> e.getSession().setErrorHandler(new CustomErrorHandler()) 
        );
    }
}