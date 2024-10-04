package org.edu.unifaa.pizzaria.model;

import java.util.Date;

public class Ingrediente {
    private long id;
    private String nome;
    private String marca;
    private Date dataValidade;
    private String observacao;
    

    
    public Ingrediente(String nome, String marca, Date dataValidade, String observacao) {
        this.nome = nome;
        this.marca = marca;
        this.dataValidade = dataValidade;
        this.observacao = observacao;
    }

    public Ingrediente(){

    }


    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
}
