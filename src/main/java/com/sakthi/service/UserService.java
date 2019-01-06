package com.sakthi.service;

import com.sakthi.entity.User;
import com.sakthi.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class UserService {
  @Inject private UserRepository userRepository;

  public User findById(String id) {
    return userRepository.findOneById(id);
  }
}
