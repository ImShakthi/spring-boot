package com.sakthi.restbox.resource;

import com.sakthi.restbox.dto.Repo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Component
@Log4j2
public class GitHubResource {
  private final GitHubApi gitHubApi;

  @Autowired
  public GitHubResource(GitHubApi gitHubApi) {
    this.gitHubApi = gitHubApi;
  }

  public List<Repo> getRepos(final String userName) throws IOException {
    Response<List<Repo>> listResponse = gitHubApi.listRepos(userName).execute();
    log.info(">>>>>>>>>>>listResponse=" + listResponse.body());
    return listResponse.body();
  }
}
