package ru.vsu.csf.ecganalyzerapi.entity;

import lombok.*;
import ru.vsu.csf.ecganalyzerapi.entity.enums.Gender;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "patient")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient extends BaseEntity {

    private String firstName;

    private String lastName;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private Integer age;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<File> files;

}
