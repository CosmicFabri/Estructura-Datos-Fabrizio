// Luis Fabrizio Guzmán Liza, 71274

package paquete;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Cola simple");
        ColaSimple cola = new ColaSimple();
        
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        
        System.out.printf("Longitud: %d\n", cola.getLongitud());
        System.out.printf("Frente: %d\n", cola.getFrente().getDato());
        
        cola.eliminar();
        System.out.printf("Longitud: %d\n", cola.getLongitud());
        System.out.printf("Frente: %d\n", cola.getFrente().getDato());
        
        ColaCircular colaC = new ColaCircular();
        colaC.insertar(2);
        colaC.insertar(4);
        colaC.insertar(6);
        colaC.insertar(8);
        colaC.insertar(10);
        System.out.printf("Longitud: %d\n", colaC.getLongitud());
        System.out.printf("Frente: %d\n", colaC.getFrente().getDato());
        System.out.printf("Atras: %d\n", colaC.getAtras().getDato());
        colaC.eliminar();
        System.out.printf("Longitud: %d\n", colaC.getLongitud());
        System.out.printf("Frente: %d\n", colaC.getFrente().getDato());
        System.out.printf("Atras: %d\n", colaC.getAtras().getDato());
    }
    
}
