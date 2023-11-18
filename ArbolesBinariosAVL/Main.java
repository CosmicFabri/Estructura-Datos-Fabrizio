package ArbolesBinariosAVL;

public class Main {
    public static void main(String[] args) {
        ArbolAVL<Integer> arbol = new ArbolAVL<Integer>();
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(19);
        arbol.insertar(17);
        System.out.println("Altura antes de eliminar elemento: " + arbol.altura());
        arbol.eliminar(17);
        System.out.println("Altura después de eliminar elemento: " + arbol.altura());
        System.out.println("¿Se encuentra el elemento '20' en el árbol? " + arbol.contiene(20));
        System.out.println("¿Se encuentra el elemento '17' en el árbol? " + arbol.contiene(17));
    }
}
