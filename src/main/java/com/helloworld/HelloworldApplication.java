package com.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloworldApplication {
	
	@Value("${TARGET:World}")
	  String target;

	  @RestController
	  class HelloworldController {
	    @GetMapping("/check")
	    String hello() {
	      return "Hello " + target + " Release happened on 25th Auguest";
	    }
	  }

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
