package com.sakthi.repository;

import com.sakthi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
  User findOneById(String id);
}
