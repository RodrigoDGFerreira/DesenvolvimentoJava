public class Peixe extends Animal{
    private int agua;

    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua) {
        super(nome, patas, velocidade, localizacao);
        this.agua = agua;
    }

    public int getAgua() {return agua;}
    public void setAgua(int agua) {this.agua = agua;}


    public void mover() {
        System.out.println(getNome() + "  nadou");
        int localAtual = getLocalizacao();
        localAtual+=2;
        setLocalizacao(localAtual);
        //setLocalizacao(getLocalizacao() + 2);
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "nome='" + getNome() + '\'' +
                ", patas=" + getPatas() +
                ", velocidade=" + getVelocidade() +
                ", localizacao=" + getLocalizacao() +
                ", Agua="+ agua +
                '}';
    }
}
