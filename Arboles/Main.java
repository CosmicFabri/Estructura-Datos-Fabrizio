public class Main {
    public static void main(String[] args) {

        // Creando el árbol ordinario desde la raíz
        Arbol<Character> arbolPrincipal = new Arbol<>('A', false);
        NodoArbol<Character> raiz = arbolPrincipal.obtenerRaiz();

        // Añadiendo el segundo nivel del árbol
        NodoArbol<Character> nodoB = new NodoArbol<>('B');
        arbolPrincipal.agregarNodoArbol(raiz, nodoB);

        // Imprimiendo el árbol
        arbolPrincipal.imprimirArbol(Recorrido.PREFIJO);
    }
}
