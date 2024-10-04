package org.edu.unifaa.pizzaria.model;

public class ModeloPizza {
    private long id;
    private String tamanho; // Media, Grande, Maracana
    private double valor;  



    public ModeloPizza(String tamanho, double valor) {
        this.tamanho = tamanho;
        this.valor = valor;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
