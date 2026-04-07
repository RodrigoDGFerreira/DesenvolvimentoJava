package exercicio1;

public class Contador {
    private static int n;
    private int b;

    Contador(int numero){
        this.n =numero;
        this.b = numero;
    }
    public void zerar(){
        this.n = 0;
    }

    public void incrementar(){
        this.n += 1;
    }
    public void retornar(){
        this.n = b;
    }

    public static int getN() {
        return n;
    }
}
