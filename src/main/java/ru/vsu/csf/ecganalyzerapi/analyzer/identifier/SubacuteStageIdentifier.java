package ru.vsu.csf.ecganalyzerapi.analyzer.identifier;

import org.springframework.stereotype.Service;
import ru.vsu.csf.ecganalyzerapi.entity.File;
import ru.vsu.csf.ecganalyzerapi.entity.ReportPeriod;

import java.util.List;

@Service
public class SubacuteStageIdentifier implements Identifier {
    @Override
    public List<ReportPeriod> identify(File file) {
        return null;
    }
}
