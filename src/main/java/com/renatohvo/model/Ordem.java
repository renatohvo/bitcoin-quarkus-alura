package com.renatohvo.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private Double preco;
    @Setter
    private String tipo;
    @Setter
    private LocalDate data;
    @Setter
    private String status;
    @Setter
    @Column(name = "user_id")
    private Long userId;

}
