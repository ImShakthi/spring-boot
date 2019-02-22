package com.sakthi.restbox.controllers;

import com.sakthi.restbox.dto.Repo;
import com.sakthi.restbox.resource.GitHubResource;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/github")
@Log4j2
public class GithubController {
  private final GitHubResource gitHubResource;

  @Autowired
  public GithubController(GitHubResource gitHubResource) {
    this.gitHubResource = gitHubResource;
  }

  @GetMapping(value = "/{userid}")
  public List<Repo> getGithubUser(@PathVariable("userid") final String userId) {
    try {
      return gitHubResource.getRepos(userId);
    } catch (IOException ioe) {
      log.error("Error while getting details " + ioe);
    }
    return null;
  }
}
