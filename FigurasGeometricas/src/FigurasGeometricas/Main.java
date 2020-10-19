package FigurasGeometricas;

import java.util.ArrayList;

public class Main {
    
    public static ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(18.0, (Double) 5.0);
        PoligonoRegular poligono = new PoligonoRegular(65.0, 21.0, 6.0);
        
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(poligono);
                
        System.out.println("Perímetro");
        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.nombre() + " " +figura.perimetro());
        }
        
        System.out.println("\nÁrea");
        for (FiguraGeometrica figura : figuras){
            System.out.println(figura.nombre() + " " + figura.area());
        }
    }
}