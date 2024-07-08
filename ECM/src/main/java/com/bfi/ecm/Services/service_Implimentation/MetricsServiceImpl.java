package com.bfi.ecm.Services;

import com.bfi.ecm.Entities.Metrics;
import com.bfi.ecm.Repositories.IMetricsRepositorie;
import com.bfi.ecm.Services.service_Interface.IMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MetricsServiceImpl implements IMetricsService {

     private  IMetricsRepositorie metricsRepository;

    @Override
    public Metrics saveMetrics(Metrics metrics) {
        return metricsRepository.save(metrics);
    }

    @Override
    public Optional<Metrics> getMetricsById(Long id) {
        return metricsRepository.findById(id);
    }

    @Override
    public List<Metrics> getAllMetrics() {
        return metricsRepository.findAll();
    }

    @Override
    public Metrics updateMetrics(Metrics metrics) {
        return metricsRepository.save(metrics);
    }

    @Override
    public void deleteMetrics(Long id) {
        metricsRepository.deleteById(id);
    }
}
