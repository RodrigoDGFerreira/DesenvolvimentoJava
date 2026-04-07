package exercicio1;

public class Main {
    void main(){
        Contador c1 = new Contador(10);
        c1.incrementar();
        c1.incrementar();
        c1.incrementar();
        c1.incrementar();
        c1.incrementar();
        System.out.println(c1.getN());
        c1.retornar();
        System.out.println(c1.getN());
        c1.zerar();
        System.out.println(c1.getN());


    }
}
