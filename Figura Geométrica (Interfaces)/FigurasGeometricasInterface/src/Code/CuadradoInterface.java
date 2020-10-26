package Code;

public class CuadradoInterface implements FiguraInterface {

    private double lado;
    
    @Override
    public void name() {
        System.out.println("Cuadrado");
    }

    @Override
    public void Area() {
        System.out.println("Area Cuadrado: " + lado * lado);
    }

    @Override
    public void Perimetro() {
        System.out.println("Perimetro Cuadrado: " + lado * 4);

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public CuadradoInterface(double lado) {
        this.lado = lado;
    }
}