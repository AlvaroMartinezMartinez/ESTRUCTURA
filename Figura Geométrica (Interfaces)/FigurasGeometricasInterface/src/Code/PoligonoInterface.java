package Code;

public class PoligonoInterface implements FiguraInterface {

    private Double lado;
    private Double apotema;
    private Double numeroLados;

    public PoligonoInterface(Double lado, Double apotema, Double numeroLados) {
        this.lado = lado;
        this.apotema = apotema;
        this.numeroLados = numeroLados;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(Double numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public void Area() {
        System.out.println("Area Poligono: " + ((lado * numeroLados) * apotema) / 2);
    }

    @Override
    public void Perimetro() {
        System.out.println("Perimetro Poligono: " + lado * numeroLados);
    }

    @Override
    public void name() {
        System.out.println("Poligono");
    }
}
