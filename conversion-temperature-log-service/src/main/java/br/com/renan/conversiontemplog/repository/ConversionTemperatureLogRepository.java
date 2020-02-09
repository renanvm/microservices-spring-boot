package br.com.renan.conversiontemplog.repository;

import br.com.renan.conversiontemplog.model.TemperatureLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConversionTemperatureLogRepository extends CrudRepository<TemperatureLog, Long> {

    @Override
    List<TemperatureLog> findAll();
}
