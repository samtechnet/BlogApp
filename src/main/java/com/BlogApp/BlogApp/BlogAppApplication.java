package com.BlogApp.BlogApp;

import com.BlogApp.BlogApp.exception.ResourceNotFoundException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;


//@RestController
//@RequestMapping
@SpringBootApplication
//@EnableAutoConfiguration(excludeName = "com.BlogApp.BlogApp")
public class BlogAppApplication  {

	public static void main(String[] args) {

		SpringApplication.run(BlogAppApplication.class, args);
	}
//	@GetMapping("/")
//	public static String home()throws ResourceNotFoundException {
//		return "This is the base endpoint";
//	}

//	@Override
//	public void run(String... args) throws Exception {
//
//	}
}
