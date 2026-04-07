package Atividade.At1;

public class Pessoa {
    private String nome;
    private char genero;
    private int idade;

    Pessoa(String nome,char c,int ano){
        this.nome = nome;
        this.genero = c;
        this.idade = ano;
    }
    Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
