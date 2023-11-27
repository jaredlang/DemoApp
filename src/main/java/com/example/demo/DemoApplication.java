package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

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
    String response = String.format("<h1>Hello %s!</h1>", name.toUpperCase()); 

    Date today = new Date(); 
    Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("US/Central"));
    cal.setTime(today);
    int year = cal.get(Calendar.YEAR);

    response += String.format("<p>Response received on %s: </p>", today);
    response += String.format("<p>All Copyrights Reserved %d</p>", year);
    System.out.println(response);
    return response;
 
  }
}
