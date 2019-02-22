package com.sakthi.restbox.service;

import com.sakthi.restbox.models.User;
import com.sakthi.restbox.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  private final UserRepository userRepository;

  @Inject
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User findById(final long id) {
    Optional<User> maybeUser = userRepository.findById(id);
    return maybeUser.orElse(null);
  }

  public List<User> findAll(){
    return userRepository.findAll();
  }
}
