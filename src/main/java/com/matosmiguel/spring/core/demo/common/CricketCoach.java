package com.matosmiguel.spring.core.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Practice for 15 minutes!";
  }

}
