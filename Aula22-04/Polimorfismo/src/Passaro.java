public class Passaro extends Animal{
    public Passaro(String nome, int patas, double velocidade, int localizacao) {
        super(nome, patas, velocidade, localizacao);
    }
    public Passaro() {

    }

    public void mover() {
        System.out.println(getNome() + " Voou");
        setLocalizacao(getLocalizacao() + 2);
    }
}
