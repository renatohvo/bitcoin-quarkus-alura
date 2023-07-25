package com.renatohvo.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

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
    private LocalDateTime data;
    @Setter
    private String status;
    @Setter
    @Column(name = "user_id")
    private Long userId;

}
