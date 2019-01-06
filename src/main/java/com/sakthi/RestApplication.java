package com.sakthi;

import com.sakthi.entity.User;
import com.sakthi.repository.CustomerRepository;
import com.sakthi.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringBootApplication
public class RestApplication {

  // https://spring.io/guides/gs/accessing-data-mongodb/
  @Autowired private CustomerRepository customerRepository;

  @Autowired UserRepository userRepository;

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
    return args -> {
      System.out.print("<<<<<<<<<<<<<Cleaning MongoDatabase>>>>>>>>>>>>>>");
//      userRepository.deleteAll();
//
//      for (int i = 0; i < 5; i++) {
//        User user = userRepository.save(new User(i,"Test", String.valueOf(i + 12)));
//
//        System.out.println("<<<<<<<<<<<<<Adding User >>>>>>>>>>>>>>");
//        System.out.println("***" + user.toString() + "***");
//      }
//
//      System.out.println("<<<<<<<<<<<<<Get All  User >>>>>>>>>>>>>>");
//      List<User> alluser = userRepository.findAll();
//      alluser.forEach(item -> System.out.println(item));
//
//      alluser.clear();
//
//      System.out.println("<<<<<<<<<<<<<Find User By Name >>>>>>>>>>>>>>");
//      alluser = userRepository.findByName("Test");
//      alluser.forEach(item -> System.out.println(item));

      System.out.println("Executed");
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
