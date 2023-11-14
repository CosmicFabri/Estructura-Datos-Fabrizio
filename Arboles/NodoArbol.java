package Arboles;

public class NodoArbol<T> {
    // El nodo es una variable genérica

    private T dato;
    // Por defecto, el nodo es general
    private boolean esBinario = false;
    // Sólo necesitamos el primer hijo de un nodo para hallar
    // sus demás hijos, es decir, los hermanos de primer hijo
    private NodoArbol<T> primerHijo;
    private NodoArbol<T> siguienteHermano;

    /**
     * Constructor del nodo. Recibe un parámetro de tipo de dato genérico.
     *
     * @param dato
     */
    public NodoArbol(T dato) {
        this.dato = dato;
        primerHijo = null;
        siguienteHermano = null;
    }

    public void agregarHijo(NodoArbol<T> hijo) {
        if (primerHijo == null) {
            primerHijo = hijo;
        } else {
            NodoArbol<T> hermano = this.primerHijo;

            if (esBinario) {
                // Debido a la naturaleza del árbol binario,
                // cada padre puede tener un máximo de 2 hijos
                if (hermano.siguienteHermano != null) {
                    System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());
                } else {
                    hermano.siguienteHermano = hijo;
                }
            } else {
                // Si hay un nodo después del primer hijo, éste
                // será el hermano anterior al hijo agregado
                while (hermano.siguienteHermano != null) {
                    hermano = hermano.siguienteHermano;
                }
                // Agregar al nuevo hijo al lado del último hermano
                hermano.siguienteHermano = hijo;
            }
        }
    }

    public NodoArbol<T> obtenerPrimerHijo() {
        return primerHijo;
    }

    public NodoArbol<T> obtenerSiguienteHermano() {
        return siguienteHermano;
    }

    public T getDato() {
        return dato;
    }

    public boolean esBinario() {
        return esBinario;
    }

    public void setEsBinario(boolean esBinario) {
        this.esBinario = esBinario;
    }

    public void imprimirEnPrefijo() {
        System.out.print(dato + "\t");
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPrefijo();
            hijo = hijo.siguienteHermano;
        }
    }

    public void imprimirEnInfijo() {
        NodoArbol<T> hijo = primerHijo;

        if (hijo != null) {
            hijo.imprimirEnInfijo();
        }

        System.out.print(dato + "\t");
        while (hijo != null) {
            hijo = hijo.siguienteHermano;
            if (hijo != null) {
                hijo.imprimirEnInfijo();
            }
        }
    }

    public void imprimirEnPosfijo() {
        NodoArbol<T> hijo = primerHijo;

        while (hijo != null) {
            hijo.imprimirEnPosfijo();
            hijo = hijo.siguienteHermano;
        }

        System.out.print(dato + "\t");
    }
}