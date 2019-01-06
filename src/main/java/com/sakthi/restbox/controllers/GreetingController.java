package com.sakthi.restbox.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.sakthi.restbox.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

  @RequestMapping("/greetings")
  public Greeting greetingAgain(
      @RequestParam(value = "name", defaultValue = "everyone") String name) {
    return new Greeting(counter.incrementAndGet(), String.format("Greetings ,", name, " again!"));
  }
}
