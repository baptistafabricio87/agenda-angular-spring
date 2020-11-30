package com.gitlab.fabricio.castro.agenda.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(name = "date_insert")
    private Instant dateInsert;
}
