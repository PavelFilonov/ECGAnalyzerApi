package ru.vsu.csf.ecganalyzerapi.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import ru.vsu.csf.ecganalyzerapi.entity.enums.Lead;
import ru.vsu.csf.ecganalyzerapi.entity.json.Content;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "file")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TypeDef(name = "json", typeClass = JsonBinaryType.class)
public class File extends BaseEntity {

    @Type(type = "json")
    @Column(name = "content", columnDefinition = "json")
    private List<Content> contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Enumerated(value = EnumType.STRING)
    private Lead lead;

    private Double period;

    private LocalDateTime dateStart;

    private Boolean isActive;

    @OneToMany(mappedBy = "file", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Peak> peaks;

    @OneToOne(mappedBy = "file", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Report report;

}
