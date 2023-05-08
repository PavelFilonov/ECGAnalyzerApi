package ru.vsu.csf.ecganalyzerapi.service;

import ru.vsu.csf.ecganalyzerapi.dto.ReportDto;

public interface ReportService {
    ReportDto getByFileId(Long fileId);
}
