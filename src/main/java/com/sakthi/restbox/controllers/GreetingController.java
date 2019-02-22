package com.sakthi.restbox.controllers;

import com.sakthi.restbox.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping
  public Greeting greetingAgain(
      @RequestParam(value = "name", defaultValue = "everyone") String name) {
    return new Greeting(counter.incrementAndGet(), String.format("Greetings ,", name, " again!"));
  }
}
