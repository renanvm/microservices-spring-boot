package br.com.renan.temperatureconversion.service;

import br.com.renan.convertegraus.model.Temperature;
import org.springframework.stereotype.Service;

@Service
public class TemperatureConversionService {


    public double toCelsius(double f){
        return (f - 32.0) / 1.8;
    }

    public double toFahrenheit(double c){
        return (c * 1.8)  + 32.0;
    }

    public Temperature getNewTemperature(double degree, String name) {
        Temperature temperature = new Temperature();
        temperature.setDegree(degree);
        temperature.setName(name);
        return temperature;
    }


}
