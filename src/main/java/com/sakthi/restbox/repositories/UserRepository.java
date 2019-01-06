package com.sakthi.restbox.repositories;

import com.sakthi.restbox.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, Integer> {
  User findById(int id);

  List<User> findByName(String name);
}
