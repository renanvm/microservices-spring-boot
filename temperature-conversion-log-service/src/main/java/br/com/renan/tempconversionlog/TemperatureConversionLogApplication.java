package br.com.renan.tempconversionlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TemperatureConversionLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureConversionLogApplication.class, args);
	}

}
