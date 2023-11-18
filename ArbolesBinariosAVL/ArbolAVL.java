package ArbolesBinariosAVL;

public class ArbolAVL <T extends Comparable<T>> {
    class Nodo {
        // Factor de equilibrio.
        int fe;

        // El dato que se encuentra en el nodo.
        T dato;

        // La altura de este nodo en el árbol.
        int altura;

        // Los hijos izquierdo y derecho de este nodo.
        Nodo izquierdo, derecho;

        public Nodo(T dato) {
            this.dato = dato;
        }
    }

    // La raíz del árbol AVL.
    private Nodo raiz;
    
    // Lleva la cuenta de cuántos nodos están dentro del árbol.
    private int nodos = 0;

    // Constructor vacío.
    public ArbolAVL() {
        this.raiz = null;
        this.nodos = 0;
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

    // Método para buscar un nodo.
    public boolean contiene(T dato) {
        return contiene(raiz, dato);
    }

    // Método auxiliar recursivo de 'contiene'.
    private boolean contiene(Nodo nodo, T dato) {
        // Caso base. No encontramos el valor en el árbol.
        if (nodo == null) return false;

        // Devuelve -1 si el dato es menor que el nodo actual,
        // 1 si el dato es mayor que el nodo, y 0 si son iguales.
        int comp = dato.compareTo(nodo.dato);

        // Avanzar a la izquierda del árbol.
        if (comp < 0) return contiene(nodo.izquierdo, dato);

        // Avanzar a la derecha del árbol.
        if (comp > 0) return contiene(nodo.derecho, dato);

        // Hemos encontrado el valor en el árbol.
        return true;
    }

    // Insertar un dato en el árbol AVL. Este dato no puede ser null.
    public boolean insertar(T dato) {
        if (dato == null) return false;

        if (!contiene(raiz, dato)){
            raiz = insertar(raiz, dato);
            nodos++;
            return true;
        }

        return false;
    }

    // Inserta un valor dentro del árbol AVL.
    private Nodo insertar(Nodo nodo, T dato) {
        // Caso base.
        if (nodo == null) return new Nodo(dato);

        // Comparar el dato con el valor en el nodo.
        int comp = dato.compareTo(nodo.dato);

        // Insertar el nodo en el subárbol izquierdo.
        if (comp < 0)
            nodo.izquierdo = insertar(nodo.izquierdo, dato);

        // Insertar el nodo en el subárbol derecho.
        else
            nodo.derecho = insertar(nodo.derecho, dato);

        // Actualizar el factor de equilibrio y los valores de la altura.
        // actualizar(nodo);

        // Re balancear el árbol
        // return balancear(nodo);
    }

    // Actualizar la altura de un nodo y el factor de equilibrio.
    private void actualizar(Nodo nodo) {
        int alturaNodoIzquierdo = (nodo.izquierdo == null) ? -1 : nodo.izquierdo.altura;
        int alturaNodoDerecho = (nodo.derecho == null) ? -1 : nodo.derecho.altura;

        // Actualizar la altura de este nodo.
        nodo.altura = 1 + Math.max(alturaNodoIzquierdo, alturaNodoDerecho);

        // Actualizar el factor de equilibrio.
        nodo.fe = alturaNodoDerecho - alturaNodoIzquierdo;
    }
}
