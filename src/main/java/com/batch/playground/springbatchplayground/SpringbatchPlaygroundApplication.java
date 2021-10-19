package com.batch.playground.springbatchplayground;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringbatchPlaygroundApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbatchPlaygroundApplication.class, args);
  }

}
