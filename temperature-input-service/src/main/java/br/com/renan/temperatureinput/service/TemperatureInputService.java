package br.com.renan.temperatureinput.service;

import br.com.renan.temperatureinput.model.Temperature;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TemperatureInputService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "temperatureFallback")
    public Temperature getTemperature(String url) {
        return restTemplate.getForObject(url, Temperature.class);
    }

    private Temperature temperatureFallback(String url) {
        return new Temperature();
    }

    @HystrixCommand(fallbackMethod = "conversionTempLogFallback")
    public HttpStatus saveConversionTempLog(String url) {
        ResponseEntity<HttpStatus> response = restTemplate.postForEntity("http://temperature-conversion-log-service/conversionLog/", url, HttpStatus.class);
        return response.getStatusCode();
    }

    public HttpStatus conversionTempLogFallback(String url) {
        return HttpStatus.SERVICE_UNAVAILABLE;
    }
}
