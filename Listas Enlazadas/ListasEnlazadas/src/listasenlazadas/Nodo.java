package listasenlazadas;

/**
 *
 * @author Martinez
 */
public class Nodo {
    private String elemento;
    private Nodo siguiente;

    public void NodoS() {
        this.elemento = "";
        this.siguiente = null;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public Nodo getSig() {
        return siguiente;
    }

    public void setSig(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
