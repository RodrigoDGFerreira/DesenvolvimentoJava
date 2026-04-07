package Atividade.at2;

public class Produtos {
    private String nome;
    private double preco;
    private String codBarra;

    Produtos(String nome, double preco,String codBarra){
        this.nome = nome;
        this.preco = preco;
        this.codBarra = codBarra;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean equals(Object obj) {
        if(codBarra.equals(obj)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nPreço: " + this.preco +
                "\nCodigo de Barra: " + this.codBarra;
    }
}
