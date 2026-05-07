public class Retangulo extends Forma2D{
    Retangulo(){super();};
    Retangulo(double x){
        super(x,"Retangulo Quadrado");
    }
    Retangulo(double x, double y){
        super(x,y,"Retangulo");
    }
    public double area() {
        return getAltura()*getLargura();
    }

}
