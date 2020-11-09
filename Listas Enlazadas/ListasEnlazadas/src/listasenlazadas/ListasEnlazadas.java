
package listasenlazadas;

import java.util.Scanner;

/**
 *
 * @author Martinez
 */
public class ListasEnlazadas {

    public static void main(String[] args) {
        String op;
        //int c;
        String e;
        Boolean exit;

        Scanner sc = new Scanner(System.in);
        
        do {      
            System.out.println("       Menu");
            System.out.println("1.- Agregar Inicio\n" +
                               "2.- Agregar Final\n" +
                               "3.- Borrar Elemento\n" +
                               "4.- Lista\n" +
                               "5.- Salir\n");      
            Lista lista = new Lista();

            System.out.println();
            op = sc.nextLine();

            if (op.equals("1")) {
                lista.addPrimero("Juan");
                lista.addPrimero("Pedro");
                lista.addPrimero("Eduardo");                
                lista.addPrimero("Alva");
                lista.listar();
                System.out.println("\nElementos Agregados!\n");
                /*System.out.println("      Agregar Inicio");
                System.out.println("Cantidad de elementos: ");
                c = sc.nextInt();
                for (int i = 0; i < c; i++) {
                    System.out.print("");
                    e = sc.nextLine();
                    n1.addPrimero(e);
                }
                exit = false;*/
            } else if (op.equals("2")) {
                lista.addFinal("Alex");
                lista.addFinal("Christian");
                lista.addFinal("Jaciel");                
                lista.addFinal("Rafael");
                lista.listar();
                System.out.println("\nElementos Agregados!\n");
                /*System.out.println("      Agregar Final");
                System.out.println("Cantidad de elementos: ");
                c = sc.nextInt();
                for (int i = 0; i < c; i++) {
                    System.out.println("");
                    e = sc.nextLine();
                    n1.addFinal(e);
                }
                exit = false;*/
            } else if (op.equals("3")) {
                System.out.println("Elemento a borrar: ");
                e = sc.nextLine();
                lista.borrar(e);
                System.out.println("Elementos Borrado!");
                exit = false;
            } else if (op.equals("4")) {
                lista.listar();
                //exit = false;
            } else if (op.equals("5")) {
                System.exit(0);
            } else {
                System.out.println("Opcion no valida");
            }
        } while (exit = true);
    }
}
