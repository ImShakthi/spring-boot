package com.sakthi.restbox;

import com.sakthi.restbox.models.User;
import com.sakthi.restbox.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringBootApplication
public class RestApplication {

  @Autowired UserService userService;

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
    return args -> {
//      System.out.print("<<<<<<<<<<<<<Cleaning MongoDatabase>>>>>>>>>>>>>>");
//      userService.deleteAll();
//
//      for (int i = 0; i < 5; i++) {
//        User user = userService.save(new User(i, "NewTestUser", String.valueOf(i + 100)));
//
//        System.out.println("<<<<<<<<<<<<<Adding User >>>>>>>>>>>>>>");
//        System.out.println("***" + user.toString() + "***");
//      }
//
//      System.out.println("<<<<<<<<<<<<<Get All  User >>>>>>>>>>>>>>");
//      List<User> alluser = userService.findAll();
//      alluser.forEach(item -> System.out.println(item));
//
//      alluser.clear();

      System.out.println("<<<<<<<<<<<<<Find User By Name >>>>>>>>>>>>>>");
      List<User> alluser = userService.findByName("NewTestUser");
      alluser.forEach(item -> System.out.println(item));

      System.out.println("<<<<<<<<<<<<<Find User By Id 1 = " + userService.findById(1));

//      System.out.println("Executed");
    };
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
