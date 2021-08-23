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
	      return "Hello Miss Gowthami \n" + target + "\n Your husband says He loves you";
	    }
	  }

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
