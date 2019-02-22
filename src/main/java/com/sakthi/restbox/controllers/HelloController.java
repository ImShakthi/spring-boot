package com.sakthi.restbox.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloController {
  @RequestMapping("/")
  public String index() {
    return "Welcome to HOME page! ";
  }
}
