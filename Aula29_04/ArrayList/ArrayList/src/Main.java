import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        ArrayList<Animal> animaisList = new ArrayList<>();
        View v = new View();
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
                    animaisList.add(v.cadastrarAnimal());

                    System.out.println("Temos " + animaisList.size() + " animais cadastrados!");
                    break;
                case 2:
                    System.out.println("Listar Animais");
                    for(Animal asd: animaisList){
                        System.out.println(asd.toString());
                    }
                    break;
                case 3:{
                    System.out.println("Mover Animal");
                    int i=0;
                    for (Animal a : animaisList){
                        System.out.println(i + " - " + a.getNome() + "\n");
                        i++;
                    }
                    System.out.println("Selecione o animal que deseja mover");
                    i = sc.nextInt();
                    animaisList.get(i).mover();

                    break;
                }
                case 4:
                    System.out.println("Editar Animal");
                    int i=0;
                    for (Animal a : animaisList){
                        System.out.println(i + " - " + a.toString() + "\n");
                        i++;
                    }
                    System.out.println("Qual Animal deseja Editar ? ");
                    i = sc.nextInt();
                    Animal apoio = animaisList.get(i);
                    int d=0;
                    do {
                        System.out.println(apoio.toString());
                        System.out.println("1 - Nome:"
                                        +"\n2 - patas: "
                                        +"\n3 - Velocidade: "
                                        +"\n4 - Localização: ");
                        if (apoio instanceof Peixe){
                            System.out.println("5 - Tipo de agua: (0 - Doce | 1 - Salgada)");

                        }
                        System.out.println("0 - Sair");
                        d = sc.nextInt();
                        switch (d){
                            case 1:
                                System.out.println("Digite o novo valor de Nome");
                                apoio.setNome(sc.next());
                                break;
                            case 2:
                                System.out.println("Digite o novo valor de Patas");
                                apoio.setPatas(sc.nextInt());
                                break;
                            case 3:
                                System.out.println("Digite o novo valor de Velocidade");
                                apoio.setVelocidade(sc.nextDouble());
                                break;
                            case 4:
                                System.out.println("Digite o novo valor de Localização");
                                apoio.setLocalizacao(sc.nextInt());
                                break;
                            case 5:
                                System.out.println("Digite o novo valor de agua");
                                ((Peixe)apoio).setAgua(sc.nextInt());
                        }
                    }while (d!=0);

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