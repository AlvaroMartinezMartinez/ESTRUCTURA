public class Main {
 
    public static void main(String[] args) {

        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];

        listaElectrodomesticos[0]=new Lavadora(500, 125, 'C', "Naranja", 36);
        listaElectrodomesticos[1]=new Lavadora(189, 55, 'E', "Rojo", 32);
        listaElectrodomesticos[2]=new Electrodomestico(159, 70, 'A', "Azul");
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(56, 15);
        listaElectrodomesticos[5]=new Lavadora(100, 25);
        listaElectrodomesticos[6]=new Television(98, 56);
        listaElectrodomesticos[7]=new Television(450, 100, 'F', "Gris", 43, false);
        listaElectrodomesticos[8]=new Television(89, 12, 'B', "Negro", 55, true);
        listaElectrodomesticos[9]=new Electrodomestico(750, 41, 'B', "Verde");

        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;
        
        for(int i=0;i<listaElectrodomesticos.length;i++){
            
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("Total de electrodomesticos: " + sumaElectrodomesticos);
        System.out.println("Total de lavadoras: " + sumaLavadoras);
        System.out.println("Total de televisiones: " + sumaTelevisiones);
    }
}