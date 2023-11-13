package Colas;

// Luis Fabrizio Guzmán Liza, 71274

public class ColaSimple {
    
    private Nodo frente;
    private int longitud;
    
    public ColaSimple(){
        frente = null;
        longitud = 0;
    }
    
    public void insertar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(frente == null){
            frente = nuevoNodo;
        }else{
            Nodo nodoActual = frente;
            while(nodoActual.getSiguiente() != null){
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
        longitud++;
    }
    
    public void eliminar(){
        if(frente != null){
            frente = frente.getSiguiente();
            longitud--;
        }
    }
    
    public boolean estaVacia(){
        return frente == null;
    }
    
    public Nodo getFrente(){
        if(!estaVacia()){
            return frente;
        }else{
            System.out.println("La cola no tiene elementos frente!");
            return null;
        }
    }
    
    public int getLongitud(){
        return longitud;
    }
    
}
