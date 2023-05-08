package ru.vsu.csf.ecganalyzerapi.analyzer.identifier;

import ru.vsu.csf.ecganalyzerapi.entity.File;
import ru.vsu.csf.ecganalyzerapi.entity.ReportPeriod;

import java.util.List;

public interface Identifier {
    List<ReportPeriod> identify(File file);
}
