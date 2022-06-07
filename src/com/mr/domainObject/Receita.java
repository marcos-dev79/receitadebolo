package com.mr.domainObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Receita {

    private String name;
    private List<Ingrediente> ingredientesList;

    public Receita(String name, List<Ingrediente> ingredientesList) {
        this.name = name;
        this.ingredientesList = ingredientesList;
    }

    public Receita(String name) {
        this.name = name;
        this.ingredientesList = new ArrayList<Ingrediente>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        ingredientesList.add(ingrediente);
    }

    public void imprimirReceita() {
        System.out.println("--------------------------------------------" + "\n");
        System.out.println(this.name + "\n");

        String ingredientes = this.ingredientesList.stream()
                .map(ingrediente -> ingrediente.getName() + " " + ingrediente.getQuantidade() + " " + ingrediente.getMedida().getMedidaString())
                .collect(Collectors.joining("\n"));

        System.out.println(ingredientes + "\n");
    }
}
