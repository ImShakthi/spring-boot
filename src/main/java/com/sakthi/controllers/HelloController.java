package com.sakthi.controllers;

import com.sakthi.entity.User;

import com.sakthi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

  @Autowired private UserService userService;

  @RequestMapping("/")
  public String index() {
    //      http://chrisbaileydeveloper.com/projects/spring-boot-mongodb-heroku-demo/
    return "Welcome to HOME page! ";
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable("id") final int id) {
    System.out.println(" Enter into get user = " + id);
//    List<User> users = userService.findAll();
//    User user = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);

    return userService.findById(id);
  }
}
