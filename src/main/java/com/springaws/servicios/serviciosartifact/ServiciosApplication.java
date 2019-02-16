package com.springaws.servicios.serviciosartifact;

import com.springaws.servicios.serviciosartifact.jsf.FacesViewScope;
import java.util.Collections;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiciosApplication extends SpringBootServletInitializer {
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiciosApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServiciosApplication.class);
    }
    
    @Bean
    public static CustomScopeConfigurer customScopeConfigurer() {
            CustomScopeConfigurer configurer = new CustomScopeConfigurer();
    configurer.setScopes(Collections.<String, Object>singletonMap(
            FacesViewScope.NAME, new FacesViewScope()));
            return configurer;
    }
	
}
