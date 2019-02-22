package com.sakthi.restbox.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sakthi.restbox.resource.GitHubApi;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

@Configuration
public class RetrofitConfig {
  @Bean
  public OkHttpClient okHttpClient() {
    return new OkHttpClient.Builder()
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .build();
  }

  @Bean
  public GitHubApi gitHubApi(OkHttpClient okHttpClient, ObjectMapper objectMapper) {
    return buildRetrofit("https://api.github.com/", okHttpClient, objectMapper)
        .create(GitHubApi.class);
  }

  private Retrofit buildRetrofit(
      String baseUrl, OkHttpClient okHttpClient, ObjectMapper objectMapper) {
    return new Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient)
        .addConverterFactory(JacksonConverterFactory.create(objectMapper))
        .build();
  }
}
