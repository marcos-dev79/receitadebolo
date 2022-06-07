package com.mr;

import com.mr.domainObject.Ingrediente;
import com.mr.domainObject.Receita;

public class Main {

    /** Método principal
     * @author @ItsSince79
     * @param args
     */
    public static void main(String[] args) {

        Receita receita = new Receita("Bolo de Chocolate");

        receita.addIngrediente(new Ingrediente("Farinha", "1", "kg"));
        receita.addIngrediente(new Ingrediente("Ovos", "4", "un"));
        receita.addIngrediente(new Ingrediente("Fermento", "1", "colher de chá"));

        receita.imprimirReceita();
    }
}
