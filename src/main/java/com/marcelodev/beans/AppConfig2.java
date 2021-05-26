package com.marcelodev.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

  @Bean
  public Mundo persona() {
    return new Mundo();
  }

}
