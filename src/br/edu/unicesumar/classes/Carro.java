package src.br.edu.unicesumar.classes;

public class Carro {
    

    private String modelo;
    private String marca;
    private int potencia;
    private double aderencia;
    private int frenagem;
    private int velocidade;

    public Carro(String modelo, String marca, int potencia, double aderencia, int frenagem){
        
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
    public int  getPotencia(){
        return potencia;
    }
    public double getAderencia(){
        return aderencia;
    }
    public int getFrenagem(){
        return frenagem;
    }
    public int getVelocidade(){
        return velocidade;
    }


    public void acelerar(){
        velocidade += potencia / 10; 
        System.out.println(modelo + "acelerou.\nVelocidade: " + velocidade + "km/h");
    }

    public void frear(){
        velocidade -= frenagem * 5;
        if(velocidade < 0){
            velocidade = 0;
        }
        System.out.println(modelo + "Freou.\nVelocidade: " + velocidade + "km/h");
    }

    public void curva(){
        double derrapar = Math.random();
        if(derrapar > aderencia){
            System.out.println(modelo + " Derrapou!");
        }
        else{
            System.out.println(modelo + "fez a curva com sucesso!");
        }
    }
}
