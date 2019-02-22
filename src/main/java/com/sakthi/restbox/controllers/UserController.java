package com.sakthi.restbox.controllers;

import com.sakthi.restbox.models.User;
import com.sakthi.restbox.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@Log4j2
public class UserController {
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<User>> getUsers() {
    return ResponseEntity.ok(userService.findAll());
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable("id") final long id) {
    System.out.println(" Enter into get user = " + id);
    return userService.findById(id);
  }

  @RequestMapping(value = "/test", method = RequestMethod.GET)
  public ResponseEntity<User> getUserResponse() {
    return ResponseEntity.ok(userService.findById(1));
  }
}
