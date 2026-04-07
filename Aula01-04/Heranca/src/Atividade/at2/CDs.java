package Atividade.at2;

public class CDs extends Produtos{
    private int NumeroFaixas;

    CDs(String nome,double preco,String codBarra,int nfaixa){
        super(nome, preco,codBarra);
        this.NumeroFaixas = nfaixa;
    }

    public int getNumeroFaixas() {return this.NumeroFaixas;}

    public void setNumeroFaixas(int numeroFaixas) {this.NumeroFaixas = numeroFaixas;}

    public String toString(){
        return super.toString() + " CDs { Numero de Faixas: " + this.NumeroFaixas + " }";
    }


}
