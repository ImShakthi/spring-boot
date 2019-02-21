package com.sakthi.restbox.service;

import com.sakthi.restbox.models.User;
import com.sakthi.restbox.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserService {
  private final UserRepository userRepository;

  @Inject
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

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
