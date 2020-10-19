
package FigurasGeometricas;

public class PoligonoRegular extends FiguraGeometrica{
    
    protected Double lado;
    protected Double perimetro;
    protected Double apotema;
    protected Double numeroLados;
    
    public PoligonoRegular() {
        super();
    }
    
    public PoligonoRegular(Double lado, Double apotema, Double numeroLados) {
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

    public Double getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(Double numeroLados) {
        this.numeroLados = numeroLados;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }
    
    @Override
    public String nombre(){
        return "Polígono";
    }
        
    @Override
    public Double perimetro() {
        perimetro = lado * numeroLados;
        return perimetro;
    }

    @Override
    public Double area() {
        return ((perimetro * apotema)/2);
    }
    
}
