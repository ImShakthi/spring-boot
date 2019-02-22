package com.sakthi.restbox.controllers;

import com.sakthi.restbox.dto.Repo;
import com.sakthi.restbox.models.User;
import com.sakthi.restbox.resource.GitHubResource;
import com.sakthi.restbox.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@Log4j2
public class HelloController {
  private final UserService userService;
  private final GitHubResource gitHubResource;

  @Autowired
  public HelloController(UserService userService, GitHubResource gitHubResource) {
    this.userService = userService;
    this.gitHubResource = gitHubResource;
  }

  @RequestMapping("/")
  public String index() {
    //      http://chrisbaileydeveloper.com/projects/spring-boot-mongodb-heroku-demo/
    return "Welcome to HOME page! ";
  }

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  public User getUser(@PathVariable("id") final int id) {
    System.out.println(" Enter into get user = " + id);
    return userService.findById(id);
  }

  @GetMapping(value = "/github/{userid}")
  public List<Repo> getGithubUser(@PathVariable("userid") final String userId) {
    try {
      List<Repo> repos = gitHubResource.getRepos(userId);
      log.info(">>>>>>>>>>repos=" + repos);
      return repos;
    } catch (IOException ioe) {
      log.error("Error while getting details " + ioe);
    }
    return null;
  }
}
