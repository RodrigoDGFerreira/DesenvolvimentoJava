package Atividade.At1;

public class Amigo extends Pessoa{
    private String dataNascimento;

    public Amigo(String nome, char genero, int ano, String dataNascimento) {
        super(nome, genero, ano);
        this.dataNascimento = dataNascimento;
    }
    Amigo(){}

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
