package com.sakthi.service;

import com.sakthi.entity.User;
import com.sakthi.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class UserService {
  @Inject private UserRepository userRepository;

  public User findById(int id) {
    return userRepository.findById(id);
  }

  public List<User> findByName(String name) {
    return userRepository.findByName(name);
  }

  public void deleteAll() {
    userRepository.deleteAll();
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }
}
