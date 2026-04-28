import java.util.ArrayList;
import java.util.Scanner;

public class Main{
public static void main (String[] args){
  ArrayList<Animal> animaisList = new ArrayList<>();
  int opcao =0;
  Scanner sc = new Scanner(System.in);


  do {
    System.out.println("1 - Cadastrar Animal:"
            +"\n2 - Listar Animais:"
            +"\n3 - Mover Animal:"
            +"\n4 - Editar Animal:"
            +"\n0 - Sair:");
    opcao = sc.nextInt();
    switch (opcao){
      case 1:
        System.out.println("Cadastrar Animal");
        int trem=0;
        System.out.println("1 - Criar Animal"
                +"\n2 - Criar Passaro"
                +"\n3 - Criar Peixe"
                +"\n0 - Sair");
        trem = sc.nextInt();
        String nome;
        int patas,localizacao;
        double velocidade;
        System.out.println("Nome do animal:");
        nome= sc.next();
        System.out.println("Quantidade de patas do Animal");
        patas = sc.nextInt();
        System.out.println("Velocidade do Animal");
        velocidade = sc.nextDouble();
        System.out.println("Localização do Animal");
        localizacao = sc.nextInt();

        switch (trem){
            case 1:
              System.out.println("Criar Animal");
              Animal a = new Animal(nome,patas,velocidade,localizacao);
              animaisList.add(a);
              break;
            case 2:
              Animal passaro = new Passaro(nome,patas,velocidade,localizacao);
              animaisList.add(passaro);
              break;
            case 3:
              int agua;
              System.out.println("Tipo de agua:"
                      +"\n0 - Doce:"
                      +"\n1 - Salgada:");
              agua = sc.nextInt();
              Animal p = new Peixe(nome,patas,velocidade,localizacao,agua);
              animaisList.add(p);
              break;

            default:
              break;
        }
        System.out.println("Temos " + animaisList.size() + " animais cadastrados!");
        break;
      case 2:
        System.out.println("Listar Animais");
        for(Animal asd: animaisList){
          System.out.println(asd.toString());
        }
        break;
      case 3:
        System.out.println("Mover Animal");
        for (Animal a : animaisList){
          a.mover();
        }
        break;
      case 4:
        System.out.println("Editar Animal");
        break;
      case 0:
        System.out.println("Saindo...");
        break;
      default:
        break;
    }

  }while(opcao !=0);
  sc.close();

  }
}
