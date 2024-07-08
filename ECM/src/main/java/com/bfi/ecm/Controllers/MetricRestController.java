package com.bfi.ecm.Controllers;


import com.bfi.ecm.Entities.Metrics;
import com.bfi.ecm.Services.service_Interface.IMetricsService;
 import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Metric")
@RequiredArgsConstructor
public class MetricRestController {
    private final IMetricsService metricsService;
    @Operation(description = "Add Metrics")
    @PostMapping("/add")
    public Metrics addMetric(@RequestBody Metrics metricsData) {
        return metricsService.saveMetrics(metricsData);
    }
    @Operation(description = "Retrieve all Metrics")
    @GetMapping("/all")
    public List<Metrics> retrieveAllMetrics() {
        return metricsService.getAllMetrics();
    }
    @Operation(description = "Retrieve Metrics by Id")
    @GetMapping("/get/{id}")
    public Metrics retrieveMetricById(@PathVariable("id") Long idMetric) {
        Optional<Metrics> metrics = metricsService.getMetricsById(idMetric);
        return metrics.orElse(null); // Return the metrics if present, otherwise return null
    }

    @Operation(description = "Update Metrics")
    @PutMapping("/update")
    public Metrics updateMetric(@RequestBody Metrics metricsData) {
        return metricsService.updateMetrics(metricsData);
    }

    @Operation(description = "Delete Metrics by Id")
    @DeleteMapping("/delete/{id}")
    public void removeMetric(@PathVariable("id") Long idMetric) {
        metricsService.deleteMetrics(idMetric);
    }
}
