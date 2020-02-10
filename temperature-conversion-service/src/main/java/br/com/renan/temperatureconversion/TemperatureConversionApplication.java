package br.com.renan.temperatureconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TemperatureConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureConversionApplication.class, args);
	}

}
