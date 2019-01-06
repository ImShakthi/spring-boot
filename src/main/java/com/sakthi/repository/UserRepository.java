package com.sakthi.repository;

import com.sakthi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User,Integer> {
    public List<User> findByName(String name);

}