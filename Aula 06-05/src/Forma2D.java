public abstract class Forma2D {
    private double largura;
    private double altura;
    private String nome;

    public Forma2D(){
        altura = largura = 0.0;
        nome = "nada";
    }
    public Forma2D(double l,double a,String n){
        largura = l;
        altura = a;
        nome = n;
    }
    Forma2D(double x,String nome){
        this.altura = this.largura = x;
        this.nome = nome;
    }

    public abstract double area();




    public double getLargura() {return largura;}
    public void setLargura(double largura) {this.largura = largura;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String toString() {
        return "Forma2D{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", nome='" + nome + '\'' +
                '}';
    }
}
