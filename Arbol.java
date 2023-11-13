package arboles;

/**
 * Clase Arbol. Este contiene nodos, y se debe determinar si es binario o no.
 */
public class Arbol<T> {

    /**
     * Tipo de dato genérico.
     */
    private NodoArbol<T> raiz;
    /**
     * Asignar 'false' para crear un árbol binario.
     */
    private boolean esBinario = false;

    /**
     * Crear nuevo árbol y determinar si es binario o no.
     *
     * @param dato
     * @param esBinario
     */
    public Arbol(T dato, boolean esBinario) {
        raiz = new NodoArbol<T>(dato);
        raiz.setEsBinario(esBinario);
        this.esBinario = esBinario;
    }

    /**
     * Devuelve el nodo raíz del arbol.
     */
    public NodoArbol<T> obtenerRaiz() {
        return raiz;
    }

    /**
     * Devuelve si el árbol es binario o no, con un valor lógico.
     *
     * @return
     */
    public boolean esBinario() {
        return esBinario;
    }

    /**
     * Agregar un nodo del mismo tipo que su árbol (general o binario).
     *
     * @param nodoRaiz
     * @param nodoAgregado
     */
    public void agregarNodoArbol(NodoArbol<T> nodoRaiz, NodoArbol<T> nodoAgregado) {
        if (esBinario) {
            nodoAgregado.setEsBinario(esBinario);
        }

        nodoRaiz.agregarHijo(nodoAgregado);
    }

    /**
     * Imprimir el árbol en forma de lista. El usuario puede elegir imprimirlo
     * en modo prefijo infijo o posfijo.
     *
     * @param recorrido
     */
    public void imprimirArbol(Recorrido recorrido) {
        switch (recorrido.ordinal()) {
            case 0:
                System.out.println("Prefijo: ");
                raiz.imprimirEnPrefijo();
                break;

            case 1:
                System.out.println("\nInfijo: ");
                raiz.imprimirEnInfijo();
                break;

            case 2:
                System.out.println("\nPosfijo: ");
                raiz.imprimirEnPosfijo();
                break;

            default:
                break;
        }
    }
}
