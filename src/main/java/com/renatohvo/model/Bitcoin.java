package com.renatohvo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Bitcoin {

    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;

}
