package ru.vsu.csf.ecganalyzerapi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "report")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Report extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id")
    private File file;

    private String description;

    @OneToMany(mappedBy = "report", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReportPeriod> reportPeriods;

}
