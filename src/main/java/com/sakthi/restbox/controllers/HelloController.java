package com.sakthi.restbox.controllers;

import com.sakthi.restbox.models.User;
import com.sakthi.restbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
  private final UserService userService;

  @Autowired
  public HelloController(UserService userService) {
    this.userService = userService;
  }

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

  @GetMapping(value = "github/{userid}")
  public ResponseBody getGithubUser(@PathVariable("userid") final String id) {
    return null;
  }
}
