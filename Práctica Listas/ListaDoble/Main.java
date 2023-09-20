
package ListaDoble;

public class Main {
    
    public static void main(String[] args) {
        
        ListaDoblementeEnlazada listaDoble = new ListaDoblementeEnlazada();
        listaDoble.insertar(5);
        listaDoble.insertar(59);
        listaDoble.insertar(91);
        listaDoble.insertar(-17);
        listaDoble.insertar(73);
        listaDoble.insertar(34);
        listaDoble.insertar(40);
        
        listaDoble.eliminar(2);
        listaDoble.eliminar(3);
        
        System.out.println(listaDoble.obtener(3));
        
    }
    
}
