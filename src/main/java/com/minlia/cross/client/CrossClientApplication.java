package com.minlia.cross.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author will
 */
@SpringBootApplication
public class CrossClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossClientApplication.class, args);
	}


	@RestController
	@RequestMapping
	public class HelloWorld{

		@GetMapping(value = {"/","/index","index.htm","index.html"})
		public String ok(){
			return "OK";
		}
	}
}
