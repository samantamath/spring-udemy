package com.example.demo.spring.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FunRestController {

  @Value("${coach.name}")
  private String coachName;
  @Value("${team.name}")
  private String teamName;

  @GetMapping("/")
  public String hello() {

    return "HI EVERYONE";
  }

  @GetMapping("/workout")

  public String workout() {
    return "workout!";
  }

  @GetMapping("/teaminfo")
  public String getinfo() {
    return "coach: " + coachName + ", team : " + teamName;
  }
}
