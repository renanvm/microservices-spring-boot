package br.com.renan.conversiontemperature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConversionTemperatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionTemperatureApplication.class, args);
	}

}
