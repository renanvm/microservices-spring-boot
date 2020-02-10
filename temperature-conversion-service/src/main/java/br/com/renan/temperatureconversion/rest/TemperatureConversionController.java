package br.com.renan.temperatureconversion.rest;

import br.com.renan.temperatureconversion.service.TemperatureConversionService;
import br.com.renan.convertegraus.model.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class TemperatureConversionController {

    @Autowired
    private TemperatureConversionService temperatureConversionService;

    @GetMapping("/toCelsius/{degree}")
    public Temperature toCelsius(@PathVariable double degree){
        Temperature temperature = this.temperatureConversionService.getNewTemperature(this.temperatureConversionService.toCelsius(degree), "Celsius");
        return temperature;
    }



    @GetMapping("/toFahrenheit/{degree}")
    public Temperature toFahrenheit(@PathVariable double degree){
        Temperature temperature = this.temperatureConversionService.getNewTemperature(this.temperatureConversionService.toFahrenheit(degree), "Fahrenheit");
        return temperature;
    }


}
