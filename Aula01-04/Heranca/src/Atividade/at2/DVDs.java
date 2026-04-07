package Atividade.at2;

public class DVDs extends Produtos {
    private String duracao;

    DVDs(String nome,double preco,String codBarra,String duracao){
        super(nome,preco,codBarra);
        this.duracao = duracao;
    }

    public String getDuracao() {return duracao;}

    public void setDuracao(String duracao) {this.duracao = duracao;}

    public String toString(){
        return super.toString() + " DVDs{ Duração: " + this.duracao +" }";
    }

}
