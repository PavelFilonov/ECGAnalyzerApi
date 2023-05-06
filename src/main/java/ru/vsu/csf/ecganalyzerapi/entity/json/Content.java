package ru.vsu.csf.ecganalyzerapi.entity.json;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Content implements Serializable {
    private double x;
    private double y;
    private int order;
}
