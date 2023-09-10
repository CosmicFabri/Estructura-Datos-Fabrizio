// Elaborado por Luis Fabrizio Guzmán Liza, matrícula: 71274

package paquete;

public class Nodo {
    
    private int dato;
    private Nodo nodo;
    
    public Nodo(int dato){
        this.dato = dato;
        nodo = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
        for (int i=10; i<200; i++){
            
        }
    }
    
}
