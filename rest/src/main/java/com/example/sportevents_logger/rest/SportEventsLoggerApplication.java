package com.example.sportevents_logger.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sportevents_logger"})
@EntityScan(basePackages = {"com.example.sportevents_logger.persistence.entities"})
@EnableJpaRepositories(basePackages = {"com.example.sportevents_logger.persistence.repositories"})
public class SportEventsLoggerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SportEventsLoggerApplication.class, args);
    }
}