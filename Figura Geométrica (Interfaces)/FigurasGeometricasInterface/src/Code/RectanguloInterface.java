package Code;

public class RectanguloInterface implements FiguraInterface {
    
    private double base;
    private double altura;

    public RectanguloInterface(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void Area() {
        System.out.println("Area Rectangulo: " + base * altura);
    }

    @Override
    public void Perimetro() {
        System.out.println("Perimetro Rectangulo: " + base + base + altura + altura);
    }

    @Override
    public void name() {
        System.out.println("Rectangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
