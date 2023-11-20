package com.matosmiguel.spring.core.demo.common;

import com.matosmiguel.spring.core.demo.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
  @Override
  public String getDailyWorkout() {
    return "Practice for 15 minutes!";
  }

}
