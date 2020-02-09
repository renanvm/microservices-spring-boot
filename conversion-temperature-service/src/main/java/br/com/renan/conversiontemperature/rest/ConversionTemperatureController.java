package br.com.renan.conversiontemperature.rest;

import br.com.renan.conversiontemperature.service.ConversionTemperatureService;
import br.com.renan.convertegraus.model.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class ConversionTemperatureController {

    @Autowired
    private ConversionTemperatureService conversionTemperatureService;

    @GetMapping("/toCelsius/{degree}")
    public Temperature toCelsius(@PathVariable double degree){
        Temperature temperature = this.conversionTemperatureService.getNewTemperature(this.conversionTemperatureService.toCelsius(degree), "Celsius");
        return temperature;
    }



    @GetMapping("/toFahrenheit/{degree}")
    public Temperature toFahrenheit(@PathVariable double degree){
        Temperature temperature = this.conversionTemperatureService.getNewTemperature(this.conversionTemperatureService.toFahrenheit(degree), "Fahrenheit");
        return temperature;
    }


}
