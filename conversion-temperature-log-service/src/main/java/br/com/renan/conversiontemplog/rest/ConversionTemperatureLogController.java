package br.com.renan.conversiontemplog.rest;


import br.com.renan.conversiontemplog.model.TemperatureLog;
import br.com.renan.conversiontemplog.repository.ConversionTemperatureLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/conversionLog")
public class ConversionTemperatureLogController {

    @Autowired
    private ConversionTemperatureLogRepository conversionTemperatureLogRepository;


    @PostMapping
    public void saveLog(@RequestBody String path){
        TemperatureLog temperatureLog = new TemperatureLog();
        temperatureLog.setDate(new Date());
        temperatureLog.setPath(path);
        conversionTemperatureLogRepository.save(temperatureLog);
    }

    @GetMapping
    public List<TemperatureLog> findAllLogs(){
        return conversionTemperatureLogRepository.findAll();
    }

}
