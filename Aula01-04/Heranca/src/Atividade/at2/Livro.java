package Atividade.at2;

public class Livro extends Produtos{
    private String autor;

    Livro(String nome,double preco,String codBarra,String autor){
        super(nome, preco,codBarra);
        this.autor = autor;
    }

    public String getAutor(){return this.autor;}
    public void setAutor(String autor){this.autor = autor;}

    @Override
    public String toString() {
        return super.toString() + "\n Livro { Autor: " + this.autor + " }";
    }

}
