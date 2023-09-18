// Elaborado por Luis Fabrizio Guzmán Liza, matrícula: 71274

package paquete;

public class Main {
    
    public static void main(String[] args){
        
        // Instanciar la clase Pila
        Pila pila = new Pila();
        
        // Insertar números
        pila.insertar(14);
        pila.insertar(27);
        pila.insertar(1);
        pila.insertar(15);
        pila.insertar(10);
        pila.insertar(90);
        pila.insertar(71);
        pila.insertar(37);
        pila.insertar(2);
        pila.insertar(48);
        
        // Imprimir el tamaño de Pila
        System.out.println(pila.getTamanio());
        
        // Quitar 4 elementos
        pila.eliminarNodo();
        pila.eliminarNodo();
        pila.eliminarNodo();
        pila.eliminarNodo();
        
        // Imprimir el elemento de la cima
        System.out.println(pila.obtenerCima());
        
        // Vaciar la lista
        pila.vaciar();
        
        // Imprimir si la lista está vacía
        if(pila.estaVacia()){
            System.out.println("La pila esta vacia!");
        }else{
            System.out.println("La pila contiene al menos un elemento!");
        }
        
    }
    
}
