package src.br.edu.unicesumar.classes;

public class Carro {
    

    private String modelo;
    private String marca;
    private String potencia;
    private String aderencia;
    private String frenagem;
    private int velocidade;

    public Carro(String modelo, String marca, String potencia, String aderencia, String frenagem){
        
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.aderencia = aderencia;
        this.frenagem = frenagem;
        this.velocidade = 0;
    }

    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getPotencia(){
        return potencia;
    }
    public String getAderencia(){
        return aderencia;
    }
    public String getFrenagem(){
        return frenagem;
    }
    public int getVelocidade(){
        return velocidade;
    }


    public void Acelerar(){
        velocidade += potencia / 10; 
    }
}
