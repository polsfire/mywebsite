package com.bfi.ecm.Services;

import com.bfi.ecm.Entities.FileMetrics;
import com.bfi.ecm.Repositories.FileMetricsRepository;
import com.bfi.ecm.Services.service_Interface.IFileMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileMetricsServiceImpl implements IFileMetricsService {

    private final FileMetricsRepository fileMetricsRepository;

    @Autowired
    public FileMetricsServiceImpl(FileMetricsRepository fileMetricsRepository) {
        this.fileMetricsRepository = fileMetricsRepository;
    }

    @Override
    public FileMetrics saveFileMetrics(FileMetrics fileMetrics) {
        return fileMetricsRepository.save(fileMetrics);
    }

    @Override
    public FileMetrics getFileMetricsById(Long id) {
        Optional<FileMetrics> fileMetrics = fileMetricsRepository.findById(id);
        return fileMetrics.orElse(null);
    }

    @Override
    public List<FileMetrics> getAllFileMetrics() {
        return fileMetricsRepository.findAll();
    }

    @Override
    public FileMetrics updateFileMetrics(FileMetrics fileMetrics) {
        return fileMetricsRepository.save(fileMetrics);
    }

    @Override
    public void deleteFileMetrics(Long id) {
        fileMetricsRepository.deleteById(id);
    }
}
