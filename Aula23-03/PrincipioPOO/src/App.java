import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---= SISTEMA BANCÁRIO! =---");
        Scanner sc = new Scanner(System.in);
        Conta c1 = null;
        int trem;
        do {

            System.out.println("1- Cadastrar Conta\n" +
                    "2- Ver dados cadastrados\n" +
                    "3- Saque\n" +
                    "4- Depositar\n" +
                    "5- Sair");
            trem = sc.nextInt();
            sc.nextLine();
            switch (trem) {
                case 1:

                    if (c1 == null) {
                        c1 = new Conta();

                        System.out.println("informe o nome da Conta:");
                        c1.Nome = sc.nextLine();
                        System.out.println("informe o Saldo da sua Conta " + c1.Nome + " !!!");
                        c1.Saldo = sc.nextDouble();
                        System.out.println("informe o Numero da sua Conta " + c1.Nome);
                        c1.Numero = sc.nextInt();
                    } else {
                        System.out.println("A conta já foi criada meu consagrado!!!");
                    }
                    break;
                case 2:
                    if (c1 != null) {
                        System.out.println(c1.toString());
                    } else {
                        System.out.println("A conta não foi criada meu consagrado!!!");
                    }
                    break;
                case 3:
                    if (c1 != null) {
                        double aaaa;
                        System.out.println(" informe o valor que deseja sacar:");
                        aaaa = sc.nextDouble();
                        c1.sacar(aaaa);
                    } else {
                        System.out.println("A conta não foi criada meu consagrado!!!");
                    }
                    break;
                case 4:
                    if (c1 != null) {
                        double aaaa;
                        System.out.println(" informe o valor que deseja depositar:");
                        aaaa = sc.nextDouble();
                        c1.depositar(aaaa);
                    } else {
                        System.out.println("A conta não foi criada meu consagrado!!!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Digitou numero errado seu porra");
                    break;
            }
            sc.reset();
        } while (trem != 5);


    }


    //System.out.println("Olá " + c1.Nome + " Seu Saldo é: " + c1.Saldo + " Numero da sua conta: " + c1.Numero);

/*


        if(c1.sacar(300)){
            System.out.println("Deu Bom!!");
            System.out.println("Saldo novo: "+ c1.Saldo);
        }else{
            System.out.println("Deu Ruim!!");
        }

 */
}
