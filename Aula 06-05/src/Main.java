void main() {
    ArrayList<Forma2D> formas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int a =0;
    do {
        Forma2D forma;
        System.out.println("1 - Cadastrar Forma" +
                         "\n2 - Exibir Formas" +
                         "\n3 - Exibir area das Formas"+
                         "\n0 - Sair");
        a = sc.nextByte();
        switch (a){
            case 1:{
                int b=0;
                System.out.println("Qual forma deseja cadastrar");
                System.out.println(
                        "1 - Retangulo"+
                        "\n2 - Triangulo"+
                        "\n3 - Circulo");
                b = sc.nextByte();
                switch (b){
                    case 1:{
                        double al,la;
                        System.out.println("Altura:");
                        al = sc.nextDouble();
                        System.out.println("Largura:");
                        la = sc.nextDouble();
                        if(al == la){
                            forma = new Retangulo(al);
                            formas.add(forma);
                        }
                    }
                }

            }
        }
    }while (a!=0);

}
