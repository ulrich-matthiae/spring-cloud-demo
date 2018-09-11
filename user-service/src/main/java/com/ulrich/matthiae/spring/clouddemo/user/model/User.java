package com.ulrich.matthiae.spring.clouddemo.user.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String userName;

    private String name;

    private LocalDate dateOfBirth;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
