package br.com.cassio.poc01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Poc01Application {

	public static void main(String[] args) {
	    SpringApplication.run(Poc01Application.class, args);
	}
}
