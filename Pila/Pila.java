// Elaborado por Luis Fabrizio Guzmán Liza, matrícula: 71274

package paquete;

public class Pila {
    
    private Nodo cima;
    int tamanio = 0;
    String Lista = "";
    
    public Pila(){
        cima = null;
        tamanio = 0;
    }
    
    // 1. Insertar un elemento en la cima
    public void insertar(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setNodo(cima);
        cima = nuevoNodo;
        tamanio++;
    }
    
    // 2. Quitar el elemento de la cima
    public int eliminarNodo(){
        int auxiliar = cima.getDato();
        cima = cima.getNodo();
        tamanio--;
        return auxiliar;
    }
    
    // 3. Comprobar si la pila está vacía
    public boolean estaVacia(){
        return cima == null;
    }
    
    // 4. Vaciar pila
    public void vaciar(){
        while(!estaVacia()){
            eliminarNodo();
        }
    }
    
    // 5. Obtener el elemento que está en la cima de la pila
    public int obtenerCima(){
        return cima.getDato();
    }
    
    // 6. Obtener el tamaño de la pila
    public int getTamanio(){
        return tamanio;
    }
    
}
