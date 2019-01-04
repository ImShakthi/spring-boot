package com.sakthi.controllers;

import com.sakthi.entities.Customer;
import com.sakthi.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired private CustomerRepository repository;

  @RequestMapping("/")
  public String index() {

      StringBuilder str = new StringBuilder();
    for (Customer customer : repository.findAll()) {
        str.append(customer);
    }
    return "Welcome to HOME page" + str.toString();
  }
}
