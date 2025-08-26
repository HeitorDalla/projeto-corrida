package br.edu.unicessumar.classes;

public class Pista {
    private String nome;
    private String distancia;
    private String tipoPista;
    private String clima;

    public Pista(String nome, String distancia, String tipoPista, String clima){
        this.nome = nome;
        this.distancia = distancia;
        this.tipoPista = tipoPista;
        this.clima = clima;
    }
    public String getnome(){
        return nome;
    }
    public String getdistancia(){
        return distancia;
    }
    public String gettipoPista(){
        return tipoPista;
    }
    public String getclima(){
        return clima;
    }

    
}
