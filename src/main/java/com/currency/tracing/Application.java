package com.currency.tracing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;

import java.util.Calendar;
import java.util.GregorianCalendar;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.currency.tracing.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
