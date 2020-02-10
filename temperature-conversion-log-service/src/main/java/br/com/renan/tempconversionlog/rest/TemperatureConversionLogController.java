package br.com.renan.tempconversionlog.rest;


import br.com.renan.tempconversionlog.model.TemperatureConversionLog;
import br.com.renan.tempconversionlog.repository.TemperatureConversionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/conversionLog")
public class TemperatureConversionLogController {

    @Autowired
    private TemperatureConversionLogRepository temperatureConversionLogRepository;


    @PostMapping
    public void saveLog(@RequestBody String path){
        TemperatureConversionLog temperatureConversionLog = new TemperatureConversionLog();
        temperatureConversionLog.setDate(new Date());
        temperatureConversionLog.setPath(path);
        temperatureConversionLogRepository.save(temperatureConversionLog);
    }

    @GetMapping
    public List<TemperatureConversionLog> findAllLogs(){
        return temperatureConversionLogRepository.findAll();
    }

}
