package com.upwork.hometask.demo;

import com.upwork.hometask.demo.services.iprule.IpRuleCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {

  @Autowired
  private IpRuleCheckService ipRuleCheckService;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void init() {
    ipRuleCheckService.refreshData();
  }

}
