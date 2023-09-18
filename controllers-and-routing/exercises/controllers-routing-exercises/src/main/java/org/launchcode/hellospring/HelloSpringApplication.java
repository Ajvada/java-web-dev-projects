package org.launchcode.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}
	@Controller
	public class HelloSpringController {

		// responds to get requests at "/hello"
		@GetMapping("hello")
		@ResponseBody
		public String hello() {
			return "Hello, Spring!";
		}

	}
}
