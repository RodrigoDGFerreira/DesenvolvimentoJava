public class Conta {
    private String nome;
    private static int numero;
    private double saldo;

    //getters e setters

    public void setNome(String nome){
        if(nome != null && nome.length()>1){
            this.nome = nome;
        }else{
            System.out.println("deu ruim");
        }
    }


    public String getNome(){
        return this.nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor>this.saldo){
            return false;
        }else{
            double saque = this.saldo - valor;
            this.saldo = saque;
            return true;
        }
    }
    public boolean depositar(double valor){
        if(valor<=0){
            return false;
        }else{
            this.saldo += valor;
            return true;
        }
    }
    public String toString(){
        return "Nome:" + this.nome + "\nNumero: " + this.numero + "\nSaldo: " + this.saldo;
    }
}
