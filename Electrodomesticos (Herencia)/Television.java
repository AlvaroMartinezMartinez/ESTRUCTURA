
public class Television extends Electrodomestico{
  
    private final static int resolucionD=20;
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        this(precio_baseD, pesoD, consumo_enegeticoD, colorD, resolucionD, false);
    }
    
    public Television(double precio_base, double peso){
        this(precio_base, peso, consumo_enegeticoD, colorD, resolucionD, false);
    }
    
    public Television(double precio_base, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precio_base, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    public static int getResoluciond() {
        return resolucionD;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public double precioFinal(){
        
        double total=super.precioFinal();
        if (resolucion>40){
            total += precio_base*0.3;
        }
        if (sintonizadorTDT){
            total += 50;
        }
  
        return total;
    }
}