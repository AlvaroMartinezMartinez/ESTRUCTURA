
package FigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
    
    private Double base;
    private Double altura;
    
    public Rectangulo() {
        super();
    }
         
    public Rectangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
            
    @Override
    public String nombre(){
        return "Rectángulo";
    }
    
    @Override
    public Double perimetro(){
        return ((base*2)+(altura*2));
    }
    
    @Override
    public Double area(){
        return (base * altura);
    }
}
