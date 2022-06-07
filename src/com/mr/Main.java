package com.mr;

import com.mr.domainObject.Ingrediente;
import com.mr.domainObject.Medidas;
import com.mr.domainObject.Receita;

public class Main {

    /** Método principal
     * @author @ItsSince79
     * @param args
     */
    public static void main(String[] args) {

        Receita receita = new Receita("Bolo de Chocolate");

        receita.addIngrediente(new Ingrediente("Farinha", 1.0, Medidas.KG));
        receita.addIngrediente(new Ingrediente("Ovos", 4.0, Medidas.UN));
        receita.addIngrediente(new Ingrediente("Fermento", 0.75, Medidas.CX));
        receita.addIngrediente(new Ingrediente("Achocolatado", 3.5, Medidas.XI));

        receita.imprimirReceita();
    }
}
