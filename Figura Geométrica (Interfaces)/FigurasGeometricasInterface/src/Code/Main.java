package Code;

import java.util.ArrayList;

/**
 *
 * @author Martinez
 */
public class Main {
    
    public static ArrayList<FiguraInterface> figuras = new ArrayList<>();
    
    public static void main(String[] args) {
        CirculoInterfaces circulo = new CirculoInterfaces(5);
        RectanguloInterface rectangulo = new RectanguloInterface(10, 5);
        PoligonoInterface poligono = new PoligonoInterface(15.0, 56.2, 5.0);
        CuadradoInterface cuadrado = new CuadradoInterface(5);
        
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(poligono);
        figuras.add(cuadrado);
                
        System.out.println("-------------");
        for (FiguraInterface figura : figuras){
            figura.name();
            figura.Area();
            figura.Perimetro();
        }
    }
}