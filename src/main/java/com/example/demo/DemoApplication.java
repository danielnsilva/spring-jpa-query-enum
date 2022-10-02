package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
public class DemoApplication {

	@Autowired
	private PersonRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping(value="/search/{searchString}")
	public ResponseEntity<List<Person>> searchPersons(@PathVariable("searchString") String searchString) {
		List<Person> results = repo.search(searchString);
		return new ResponseEntity<List<Person>>(results, HttpStatus.OK);
	}
	

}
