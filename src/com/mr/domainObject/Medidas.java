package com.mr.domainObject;

public enum Medidas {
    KG("Quilo"),
    LT("Litro"),
    UN("Unidade"),
    XI("Xícara"),
    CX("Colher de chá"),
    CS("Colher de sopa");

    private final String medida;

    Medidas(String medida) {
        this.medida = medida;
    }

    public String getMedidaString() {
        return this.medida;
    }
}
