package com.himarkussohn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @author: himarkussohn
 * @date: 2018-11-07
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            List<String> beanDefinitionNames = Arrays.asList(ctx.getBeanDefinitionNames());
            beanDefinitionNames.forEach(System.out::println);
        };
    }

    @Bean
    public RestOperations restTemplate() {
        return new RestTemplate();
    }
}
