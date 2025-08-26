package src.br.edu.unicesumar.classes;

public class Equipe {
    private int id;
    private String roupa;
    private String marca;

    /* Função para retornar o id da equipe */
    public int getId () {
        return this.id;
    }

    /* Função para retornar a roupa da equipe */
    public String getRoupa () {
        return this.roupa;
    }

    /* Função para retornar a marca da equipe */
    public String getMarca () {
        return this.marca;
    }
}