package br.com.renan.temperatureinput.rest;

import br.com.renan.temperatureinput.model.Temperature;
import br.com.renan.temperatureinput.service.TemperatureInputService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/input")
public class TemperatureInputController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TemperatureInputService temperatureInputService;

    @GetMapping("/celsius/{degree}")
    public Temperature getFahreinheitTemperature (@PathVariable double degree){
        return temperatureInputService.getTemperature("http://temperature-conversion-service/convert/toFahrenheit/"+degree);
    }

    @GetMapping("/fahrenheit/{degree}")
    public Temperature getCelsiusTemperature(@PathVariable double degree){
        return temperatureInputService.getTemperature("http://temperature-conversion-service/convert/toCelsius/"+degree);
    }

}
