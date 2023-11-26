package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@RestController
class HelloDockerRestController {
  @RequestMapping("/hello/{name}")
  public String helloDocker(@PathVariable(value = "name") String name) {
    String response = String.format("<h1>Hello Mr. %s</h1>", name.toUpperCase()); 
    response += String.format("<p>Response received on %s: </p>", new Date());
    System.out.println(response);
    return response;
 
  }
}
