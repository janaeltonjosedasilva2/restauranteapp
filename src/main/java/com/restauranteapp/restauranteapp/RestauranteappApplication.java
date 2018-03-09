/*
 *Página que faz a chamada do Spring Boot
 */

package com.restauranteapp.restauranteapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestauranteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteappApplication.class, args);
	}
}
