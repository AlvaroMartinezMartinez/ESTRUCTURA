
public class Lavadora extends Electrodomestico{
  
    private final static int cargaD=5;
    private int carga;

    public Lavadora(){
        this(precio_baseD, pesoD, consumo_enegeticoD, colorD, cargaD);
    }
    public Lavadora(double precio_base, double peso){
        this(precio_base, peso, consumo_enegeticoD, colorD, cargaD);
    }
    public Lavadora(double precio_base, double peso, char consumoEnergetico, String color, int carga){
        super(precio_base,peso, consumoEnergetico,color);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){
        double total=super.precioFinal();
        if (carga > 30){
            total += 50;
        }
        return total;
    }
}