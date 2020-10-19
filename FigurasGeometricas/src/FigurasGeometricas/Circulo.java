
package FigurasGeometricas;

public class Circulo extends FiguraGeometrica{
    
    private double radio;
    
    public Circulo() {
        super();
    }    
    
    public Circulo (double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
            
    @Override
    public String nombre(){
        return "Circulo";
    }
    
    @Override
    public Double perimetro(){
        return (Double) (2*Math.PI*radio);
    }

    @Override
    public Double area(){
        return (Double) (Math.PI * (radio*radio));
    }
}
