package ru.vsu.csf.ecganalyzerapi.entity;

import lombok.*;
import ru.vsu.csf.ecganalyzerapi.entity.enums.Role;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity {

    @Column(unique = true)
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

}
