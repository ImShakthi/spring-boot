package com.sakthi.controllers;

import com.sakthi.entity.Customer;
import com.sakthi.entity.User;
import com.sakthi.repository.CustomerRepository;

import com.sakthi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired private UserRepository userRepository;

  @RequestMapping("/")
  public String index() {
//      http://chrisbaileydeveloper.com/projects/spring-boot-mongodb-heroku-demo/
      StringBuilder str = new StringBuilder();
    for (User user : userRepository.findAll()) {
        str.append(user + ", ");
    }
    return "Welcome to HOME page" + str.toString();
  }
}
