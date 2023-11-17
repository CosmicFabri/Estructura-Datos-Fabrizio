package ArbolesBinariosAVL;

public class ArbolAVL <T extends Comparable<T>> {
    class Nodo {
        // Factor de equilibrio.
        int fe;

        // El valor que se encuentra en el nodo.
        T valor;

        // La altura de este nodo en el árbol.
        int altura;

        // Los hijos izquierdo y derecho de este nodo.
        Nodo izquierdo, derecho;
    }

    // La raíz del árbol AVL.
    private Nodo raiz;
    
    // Lleva la cuenta de cuántos nodos están dentro del árbol.
    private int nodos = 0;

    // Constructor vacío.
    public ArbolAVL() {
        this.raiz = null;
    }

    // La altura de un árbol es el número de niveles que hay entre
    // la raíz y la hoja más lejana, lo que quiere decir que, si el
    // árbol sólo tiene un nodo, entonces tiene una altura de 0.
    public int altura() {
        if (raiz == null) return 0;
        return raiz.altura;
    }

    // Devuelve la cantidad de nodos en el árbol.
    public int tamano() {
        return nodos;
    }

    // Devuelve si el árbol está vacío o no.
    public boolean estaVacio() {
        return tamano() == 0;
    }
}
