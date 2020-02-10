package br.com.renan.inputemperature.rest;

import br.com.renan.inputemperature.model.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/input")
public class InputTemperatureController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/celsius/{degree}")
    public Temperature getFahreinheitTemperature (@PathVariable double degree){
        return restTemplate.getForObject("http://conversion-temperature-service/convert/toFahrenheit/"+degree, Temperature.class);
    }

    @GetMapping("/fahrenheit/{degree}")
    public Temperature getCelsiusTemperature(@PathVariable double degree){
        return restTemplate.getForObject("http://conversion-temperature-service/convert/toCelsius/"+degree, Temperature.class);
    }

}
