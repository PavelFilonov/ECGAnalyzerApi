package ru.vsu.csf.ecganalyzerapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vsu.csf.ecganalyzerapi.service.ReportService;

@RestController
@RequestMapping(value = "/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @GetMapping("/patients/{patientId}")
    public ResponseEntity<?> getByPatientId(@PathVariable Long patientId) {
        return null;
    }

}
