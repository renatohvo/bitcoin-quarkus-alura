package com.renatohvo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Ordem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    private Double preco;
    @Getter
    @Setter
    private String tipo;
    @Getter
    @Setter
    private LocalDateTime data;
    @Getter
    @Setter
    private String status;
    @Getter
    @Setter
    @Column(name = "user_id")
    private Long userId;

}
