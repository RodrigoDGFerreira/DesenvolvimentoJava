public class Circulo extends Forma2D {
    Circulo(){
        super();
    }
    Circulo(double d){
        super(d,"Circulo");
    }
    public double getDiametro(){
        return getAltura() + getLargura();
    }
    public double area(){
        return 3.14 * getDiametro() * getDiametro();
    }
}
