package com.teste.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class TesteApplication {
	@GetMapping(value = "/")
	public String HelloWorld(){
		return String.format("Hello World!!! Tentativa");
	}

	public static void main(String[] args) {SpringApplication.run(TesteApplication.class, args);}

}
