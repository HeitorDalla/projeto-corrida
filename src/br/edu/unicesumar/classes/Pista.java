package src.br.edu.unicesumar.classes;

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
     // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public void setTipoPista(String tipoPista) {
        this.tipoPista = tipoPista;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    // Método para exibir informações da pista
    @Override
    public String toString() {
        return "Pista: " + nome + " | Distância: " + distancia +
               " | Tipo: " + tipoPista + " | Clima: " + clima;
    }

    
}
