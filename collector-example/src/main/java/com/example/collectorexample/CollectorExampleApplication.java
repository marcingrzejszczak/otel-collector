package com.example.collectorexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CollectorExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectorExampleApplication.class, args);
	}

}


@RestController
class Foo {

	private static final Logger log = LoggerFactory.getLogger(Foo.class);

	@GetMapping("/hello")
	void foo() {
		log.info("HELLO");
	}
}
