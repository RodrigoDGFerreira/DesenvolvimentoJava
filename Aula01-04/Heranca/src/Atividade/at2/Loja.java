package Atividade.at2;

public class Loja {
    static void main() {
        Produtos estante[] = new Produtos[5];
        estante [0] = new Livro("A volta dos que não foram",30.0,"20503","chapa");
        estante [1] = new Livro("A volta dos que não foram 2",30.0,"20503","chapa");
        estante [2] = new CDs("Ladrão", 90.00,"10010",10);
        estante [3] = new CDs("Historia da minha area", 90.00,"10510",10);
        estante [4] = new DVDs("Hat Trick",20.00,"34218","04:18");

//        for(int i=0;i<5;i++){
//            System.out.println(estante[i].toString());
//
//        }
        System.out.println(estante[0].equals(estante[1]));

    }
}
