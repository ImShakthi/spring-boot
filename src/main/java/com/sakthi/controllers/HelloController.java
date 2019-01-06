package com.sakthi.controllers;

import com.sakthi.entity.User;

import com.sakthi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired private UserService userService;

  @RequestMapping("/")
  public String index() {
    //      http://chrisbaileydeveloper.com/projects/spring-boot-mongodb-heroku-demo/
    return "Welcome to HOME page! ";
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public String getUser(@PathVariable("id") final String id) {
    System.out.println(" Enter into get user = " + id);
    User user = userService.findById(id);
    System.out.println("User = " + user);
    if (user == null) {
      return "No user found!";
    }
    return user.toString();
  }
}
