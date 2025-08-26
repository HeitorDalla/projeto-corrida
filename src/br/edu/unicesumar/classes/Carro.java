package br.edu.unicessumar.classes;

public class Carro {
    

    private String modelo;
    private String marca;
    private String potencia;
    private String aderencia;
    private String frenagem;
    private String velocidade;

    public Carro(String modelo, String marca, String potencia, String aderencia, String frenagem, String velocidade){
        
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.aderencia = aderencia;
        this.frenagem = frenagem;
        this.velocidade = velocidade;
    }
}
