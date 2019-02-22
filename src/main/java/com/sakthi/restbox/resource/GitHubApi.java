package com.sakthi.restbox.resource;

import com.sakthi.restbox.dto.Repo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubApi {
  @GET("users/{userid}/repos")
  Call<List<Repo>> listRepos(@Path("userid") String userName);
}
