// Elaborado por Luis Fabrizio Guzmán Liza el 19/09/2023. Matrícula

package ListaSimple;

public class Main {
    
    public static void main(String[] args){
        
        ListaSimplementeEnlazada listaSimple = new ListaSimplementeEnlazada();
        listaSimple.insertar(5);
        listaSimple.insertar(59);
        listaSimple.insertar(91);
        listaSimple.insertar(-17);
        listaSimple.insertar(73);
        listaSimple.insertar(34);
        listaSimple.insertar(40);
        
        listaSimple.eliminar(2);
        listaSimple.eliminar(3);
        
        System.out.println(listaSimple.obtener(3));
        
    }
    
}
