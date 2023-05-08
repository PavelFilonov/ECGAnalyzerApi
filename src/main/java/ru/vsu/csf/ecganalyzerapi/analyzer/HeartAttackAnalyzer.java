package ru.vsu.csf.ecganalyzerapi.analyzer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vsu.csf.ecganalyzerapi.analyzer.identifier.Identifier;
import ru.vsu.csf.ecganalyzerapi.entity.File;
import ru.vsu.csf.ecganalyzerapi.entity.Report;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HeartAttackAnalyzer implements Analyzer {

    private final List<Identifier> identifiers;

    @Override
    public Report analyze(File file) {
        return null;
    }
}
