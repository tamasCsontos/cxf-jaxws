package com.codenotfound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.tempuri.BasicHttpBinding_IServiceImpl;

import javax.annotation.PostConstruct;
import javax.xml.ws.Endpoint;

@SpringBootApplication
public class SpringCxfApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCxfApplication.class, args);
  }

//  @PostConstruct
  public void teszt () {
    Object implementor = new BasicHttpBinding_IServiceImpl();
    String address = "http://localhost:8731/PostaInterfaceService/";
    Endpoint.publish(address, implementor);
  }

}
