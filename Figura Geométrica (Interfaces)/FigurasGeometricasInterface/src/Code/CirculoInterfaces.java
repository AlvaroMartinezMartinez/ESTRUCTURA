package Code;

public class CirculoInterfaces implements FiguraInterface {

    private double radio;
    static final double pi = 3.1415;

    @Override
    public void Area() {
        System.out.println("Area Circulo: " + pi * (radio * radio));
    }

    @Override
    public void Perimetro() {
        System.out.println("Perimetro Circulo: " + 2 * pi * radio);
    }

    @Override
    public void name() {
        System.out.println("Circulo");
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static double getPi() {
        return pi;
    }

    public CirculoInterfaces(double radio) {
        this.radio = radio;
    }
}
