package com.mr.domainObject;

public class Ingrediente {
    private String name;
    private Double quantidade;
    private Medidas medida;

    public Ingrediente(String name, Double quantidade, Medidas medida) {
        this.name = name;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public String getName() {
        return name;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Medidas getMedida() {
        return medida;
    }
}
