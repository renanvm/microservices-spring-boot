package br.com.renan.tempconversionlog.repository;

import br.com.renan.tempconversionlog.model.TemperatureConversionLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureConversionLogRepository extends CrudRepository<TemperatureConversionLog, Long> {

    @Override
    List<TemperatureConversionLog> findAll();
}
