package com.newland.starpos.addedvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AddedValueApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AddedValueApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AddedValueApplication.class);
    }
}
