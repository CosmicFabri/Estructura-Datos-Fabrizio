// Elaborado por Luis Fabrizio Guzmán Liza el 19/09/2023. Matrícula: 71274

package ListaDoble;

public class Nodo {
    
    private int dato;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }
    
    public int getDato(){
        return dato;
    }
    
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public Nodo getAnterior(){
        return anterior;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
}
