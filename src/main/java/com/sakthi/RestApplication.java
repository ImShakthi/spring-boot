package com.sakthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
  public class RestApplication {
  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

//  @Bean
//  public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
//    return args -> {
//      System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//      String[] beanNames = ctx.getBeanDefinitionNames();
//      Arrays.sort(beanNames);
//      for (String beanName : beanNames) {
//        System.out.println(beanName);
//      }
//    };
//  }
}