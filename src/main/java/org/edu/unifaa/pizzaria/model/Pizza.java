package org.edu.unifaa.pizzaria.model;
import org.edu.unifaa.pizzaria.model.Enum.ETipoPizza;


import java.util.List;
import java.util.ArrayList;

public class Pizza {
    private long id;
    private String nome;
    private List<ModeloPizza> modelos;
    private List<Ingrediente> ingredientes;
    private ETipoPizza tipo;
    private boolean ativa;
    private String observacao;


    public Pizza(String nome, List<ModeloPizza> modelos, List<Ingrediente> ingredientes, ETipoPizza tipo, boolean ativa,
            String observacao) {
        this.nome = nome;
        this.modelos = modelos;
        this.ingredientes = ingredientes;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;
    }


    public Pizza(String nome, ETipoPizza tipo, boolean ativa, String observacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.ativa = ativa;
        this.observacao = observacao;

        this.modelos = new ArrayList<ModeloPizza>();
        this.ingredientes = new ArrayList<Ingrediente>();
    }


    

    
}
 