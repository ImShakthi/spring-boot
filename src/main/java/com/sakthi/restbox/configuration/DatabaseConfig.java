package com.sakthi.restbox.configuration;

import com.mongodb.MongoClient;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.inject.Inject;

@Configuration
@EnableMongoRepositories("com.sakthi.restbox.repositories")
@Import(value = MongoAutoConfiguration.class)
public class DatabaseConfig extends AbstractMongoConfiguration {

  private final MongoClient mongoClient;
  private final MongoProperties mongoProperties;

  @Inject
  public DatabaseConfig(MongoClient mongoClient, MongoProperties mongoProperties) {
    this.mongoClient = mongoClient;
    this.mongoProperties = mongoProperties;
  }

  @Bean
  public ValidatingMongoEventListener validatingMongoEventListener() {
    return new ValidatingMongoEventListener(validator());
  }

  @Bean
  public LocalValidatorFactoryBean validator() {
    return new LocalValidatorFactoryBean();
  }

  @Override
  protected String getDatabaseName() {
    return mongoProperties.getDatabase();
  }

  @Override
  public MongoClient mongoClient() {
    return mongoClient;
  }
}
