package com.mr.domainObject;

public class Ingrediente {
    private String name;
    private String quantidade;
    private String medida;

    public Ingrediente(String name, String quantidade, String medida) {
        this.name = name;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public String getName() {
        return name;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getMedida() {
        return medida;
    }
}
