package com.example.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configurable
public class ApplicationConfig {


    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("validationMessage");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
