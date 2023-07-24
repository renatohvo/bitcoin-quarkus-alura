package com.renatohvo.model;

import java.time.LocalDate;

public class Bitcoin {

    private Long id;

    private Double preco;

    private String tipo;

    private LocalDate data;

    public Bitcoin(Long id, Double preco, String tipo, LocalDate data) {
        this.id = id;
        this.preco = preco;
        this.tipo = tipo;
        this.data = data;
    }

    public Bitcoin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
