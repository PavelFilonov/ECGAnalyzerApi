package ru.vsu.csf.ecganalyzerapi.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "report_period")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportPeriod extends BaseEntity {

    private String conclusion;

    private Double timeValueStart;

    private Double timeValueEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_id")
    private Report report;

}
