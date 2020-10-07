public class Electrodomestico {
    
    protected final static String colorD="blanco";
    
    protected final static char consumo_enegeticoD='F';
    protected final static double precio_baseD=100;
    protected final static double pesoD=5;
    protected double precio_base;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(){
        this(precio_baseD, pesoD, consumo_enegeticoD, colorD);
    }

    public Electrodomestico(double precio_base, double peso){
        this(precio_base, peso, consumo_enegeticoD, colorD);
    }

    public Electrodomestico(double precio_base, double peso, char consumoEnergetico, String color){
        this.precio_base=precio_base;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico >= 65 && consumoEnergetico <= 70){
            this.consumoEnergetico  = consumoEnergetico;
        }else{
            this.consumoEnergetico = consumo_enegeticoD;
        }
          
    }

    private void comprobarColor(String color){
        
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
        }
        if(encontrado){
            this.color=color;
        }else{
            this.color=colorD;
        }          
    }

    public double precioFinal(){
        double total=0;
        switch(consumoEnergetico){
            case 'A':
                total+=100;
                break;
            case 'B':
                total+=80;
                break;
            case 'C':
                total+=60;
                break;
            case 'D':
                total+=50;
                break;
            case 'E':
                total+=30;
                break;
            case 'F':
                total+=10;
                break;
        }
   
        if(peso >= 0 && peso < 19){
            total += 10;
        }else if(peso >= 20 && peso < 49){
            total+=50;
        }else if(peso >= 50 && peso <= 79){
            total += 80;
        }else if(peso >= 80){
            total += 100;
        }
   
        return precio_base + total;
    }
    
    public double getprecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }
    
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
    public double getPeso() {
        return peso;
    }
}