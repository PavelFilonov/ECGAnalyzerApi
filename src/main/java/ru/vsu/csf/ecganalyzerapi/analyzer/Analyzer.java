package ru.vsu.csf.ecganalyzerapi.analyzer;

import ru.vsu.csf.ecganalyzerapi.entity.File;
import ru.vsu.csf.ecganalyzerapi.entity.Report;

public interface Analyzer {
    Report analyze(File file);
}
