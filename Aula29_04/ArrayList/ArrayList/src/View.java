import java.util.Scanner;

public class View {
    public Animal cadastrarAnimal(){
        Animal a =null;
        Scanner sc = new Scanner(System.in);
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
                a = new Animal(nome,patas,velocidade,localizacao);
                break;
            case 2:
                a = new Passaro(nome,patas,velocidade,localizacao);
            case 3:
                int agua;
                System.out.println("Tipo de agua:"
                        +"\n0 - Doce:"
                        +"\n1 - Salgada:");
                agua = sc.nextInt();
                a = new Peixe(nome,patas,velocidade,localizacao,agua);
                break;

            default:
                break;
        }
        return a;
    }

}
