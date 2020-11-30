
/**
 * @author Martinez
 */

public class Main {
    public static void main(String[] args) throws Exception {

        ListaEnlazada<Persona> listacola = new ListaEnlazada<>();
        generarlistacola(listacola);
         
        double recaudacion;
        double recaudacionTotal = 0;
        Persona espectador;
        int edad;

        while(!listacola.estaVacia()){
             
            espectador=listacola.devolverPrimero();
            edad=espectador.getEdad();
            if (edad >= 5 && edad <= 10){ recaudacion = 1; }else if(edad >= 11 && edad <= 17){
                recaudacion = 2.5;
            } else{
                recaudacion = 3.5;
            }
            recaudacionTotal+=recaudacion;
            System.out.println("Una persona de "+edad+" años se le ha cobrado " +recaudacion+ " euros");
            listacola.quitarPrimero();
        }
        System.out.println("Cantidad total recaudada "+recaudacionTotal+" euros");
    }

    public static void generarlistacola(ListaEnlazada<Persona> listacola){
         
       int numeroPersonas=generaNumeroAleatorio(1,50);
       for(int i=0;i<numeroPersonas;i++){
           listacola.insertarUltimo(new Persona(generaNumeroAleatorio(5, 60)));
       }
    }

    public static int generaNumeroAleatorio(int minimo, int maximo){
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
}
