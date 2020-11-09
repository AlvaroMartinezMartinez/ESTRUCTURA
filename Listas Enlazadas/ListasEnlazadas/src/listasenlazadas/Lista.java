package listasenlazadas;

/**
 *
 * @author Martinez
 */
public class Lista {
    private Nodo primero;
    private int nElementos;

    public void ListaS (){ 
        primero = null;
        nElementos = 0;
    }

    public boolean esVacia(){
        return primero == null;
    }

    public int getNElementos(){
        return nElementos;
    }

    public void addPrimero(String elemento){
        Nodo nuevo = new Nodo();
        nuevo.setElemento(elemento);
        if (esVacia()) {
            primero = nuevo;
        } else{
            nuevo.setSig(primero);
            primero = nuevo;
        }
        nElementos++;
    }

    public void addFinal(String elemento){
        Nodo nuevo = new Nodo();
        nuevo.setElemento(elemento);
        if (esVacia()) {
            primero = nuevo;
        } else{
            Nodo aux = primero;
            while(aux.getSig() != null){
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
        nElementos++;
    }

    public boolean buscar(String referencia){
        Nodo aux = primero;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (referencia == aux.getElemento()){
                encontrado = true;
            }
            else{
                System.out.println("No encontrado");
                aux = aux.getSig();
            }
        }
        return encontrado;
    }

    public void borrar(String elemento){
        if (buscar(elemento)) {
            if (primero.getElemento() == elemento) {
                primero = primero.getSig();
            } else {
                Nodo aux = primero;
                while(aux.getSig().getElemento() != elemento){
                    aux = aux.getSig();
                }
                Nodo siguiente = aux.getSig().getSig();
                aux.setSig(siguiente);  
            }
            nElementos--;
        }
    }
    public void listar(){
        if (!esVacia()) {
            Nodo aux = primero;
            int i = 0;
            while(aux != null){
                System.out.print(i + ".[ " + aux.getElemento() + " ]" + ",  ");
                aux = aux.getSig();
                i++;
            }
        }
    }
}