package ru.vsu.csf.ecganalyzerapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.csf.ecganalyzerapi.analyzer.Analyzer;
import ru.vsu.csf.ecganalyzerapi.dto.ReportDto;
import ru.vsu.csf.ecganalyzerapi.entity.File;
import ru.vsu.csf.ecganalyzerapi.entity.Report;
import ru.vsu.csf.ecganalyzerapi.repository.FileRepository;
import ru.vsu.csf.ecganalyzerapi.service.ReportService;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final Analyzer analyzer;
    private final FileRepository fileRepository;

    @Override
    public ReportDto getByFileId(Long fileId) {
        File file = fileRepository.findById(fileId).orElseThrow();
        Report report = file.getReport() != null ? file.getReport() : analyzer.analyze(file);
        return new ReportDto(report);
    }
}
