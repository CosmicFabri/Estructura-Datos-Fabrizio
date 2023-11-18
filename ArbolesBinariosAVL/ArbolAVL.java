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
        actualizar(nodo);

        // Re balancear el árbol
        return balancear(nodo);
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

    // Re balancea el árbol si el factor de equilibrio es +2 o -2
    private Nodo balancear(Nodo nodo) {
        // Subárbol izquierdo más grande
        if (nodo.fe == -2) {
            if (nodo.izquierdo.fe <= 0) {
                return leftLeftCase(nodo);
            } else {
                return leftRightCase(nodo);
            }

        // Subarbol derecho más grande
        } else if (nodo.fe == +2) {
            if (nodo.derecho.fe >= 0) {
                return rightRightCase(nodo);
            } else {
                return rightLeftCase(nodo);
            }
        }

        // El nodo tiene un balance de 0, 1 o -1. No hacemos cambios.
        return nodo;
    }

    private Nodo leftLeftCase(Nodo nodo) {
        return rightRotation(nodo);
    }

    private Nodo leftRightCase(Nodo nodo) {
        nodo.izquierdo = leftRotation(nodo.izquierdo);
        return leftLeftCase(nodo);
    }

    private Nodo rightRightCase(Nodo nodo) {
        return leftRotation(nodo);
    }

    private Nodo rightLeftCase(Nodo nodo) {
        nodo.derecho = rightRotation(nodo.derecho);
        return rightRightCase(nodo);
    }

    private Nodo leftRotation(Nodo nodo) {
        Nodo nuevoPadre = nodo.derecho;
        nodo.derecho = nuevoPadre.izquierdo;
        nuevoPadre.izquierdo = nodo;
        actualizar(nodo);
        actualizar(nuevoPadre);
        return nuevoPadre;
    }

    private Nodo rightRotation(Nodo nodo) {
        Nodo nuevoPadre = nodo.izquierdo;
        nodo.izquierdo = nuevoPadre.derecho;
        nuevoPadre.derecho = nodo;
        actualizar(nodo);
        actualizar(nuevoPadre);
        return nuevoPadre;
    }

    // Eliminar un nodo de este árbol, si es que existe.
    public boolean eliminar(T elemento) {
        if (elemento == null) return false;

        if (contiene(raiz, elemento)) {
            raiz = eliminar(raiz, elemento);
            nodos--;
            return true;
        }

        return false;
    }

    // Remueve un valor de este árbol.
    private Nodo eliminar(Nodo nodo, T dato) {
        if (nodo == null) return null;

        int comp = dato.compareTo(nodo.dato);

        if (comp < 0) {
            nodo.izquierdo = eliminar(nodo.izquierdo, dato);
        } else if (comp > 0) {
            nodo.derecho = eliminar(nodo.derecho, dato);
        } else {
            if (nodo.izquierdo == null) {
                return nodo.derecho;
            } else if (nodo.derecho == null) {
                return nodo.izquierdo;
            } else {
                if (nodo.izquierdo.altura > nodo.derecho.altura) {
                    T valorSucesor = findMax(nodo.izquierdo);
                    nodo.dato = valorSucesor;

                    nodo.izquierdo = eliminar(nodo.izquierdo, valorSucesor);
                } else {
                    T valorSucesor = findMin(nodo.derecho);
                    nodo.dato = valorSucesor;

                    nodo.derecho = eliminar(nodo.derecho, valorSucesor);
                }
            }
        }

        actualizar(nodo);
        return balancear(nodo);
    }

    private T findMin(Nodo nodo) {
        while (nodo.izquierdo != null)
            nodo = nodo.izquierdo;
        return nodo.dato;
    }

    private T findMax(Nodo nodo) {
        while (nodo.derecho != null)
            nodo = nodo.derecho;
        return nodo.dato;
    }
}
