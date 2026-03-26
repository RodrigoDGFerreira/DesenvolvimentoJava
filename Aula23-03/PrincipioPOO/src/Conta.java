public class Conta {
    String Nome;
    int Numero;
    double Saldo;
    
    public boolean sacar(double valor){
        if(valor>this.Saldo){
            return false;
        }else{
            double saque = this.Saldo - valor;
            this.Saldo = saque;
            return true;
        }
    }
    public boolean depositar(double valor){
        if(valor<=0){
            return false;
        }else{
                this.Saldo += valor;
            return true;
        }
    }
    public String toString(){
        return "Nome:" + this.Nome + "\nNumero: " + this.Numero + "\nSaldo: " + this.Saldo;
    }
}
