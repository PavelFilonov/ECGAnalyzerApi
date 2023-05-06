package ru.vsu.csf.ecganalyzerapi.entity;

import lombok.*;
import ru.vsu.csf.ecganalyzerapi.entity.enums.TypePeak;

import javax.persistence.*;

@Entity
@Table(name = "peak")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Peak extends BaseEntity {

    private Double timeValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id")
    private File file;

    @Enumerated(value = EnumType.STRING)
    private TypePeak typePeak;

}
