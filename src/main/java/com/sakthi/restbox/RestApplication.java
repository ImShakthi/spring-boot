package com.sakthi.restbox;

import com.sakthi.restbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestApplication {

  private final UserService userService;

  @Autowired
  public RestApplication(UserService userService) {
    this.userService = userService;
  }

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
    return args -> {};
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
