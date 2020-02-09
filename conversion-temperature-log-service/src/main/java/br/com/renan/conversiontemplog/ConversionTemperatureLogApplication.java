package br.com.renan.conversiontemplog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConversionTemperatureLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionTemperatureLogApplication.class, args);
	}

}
