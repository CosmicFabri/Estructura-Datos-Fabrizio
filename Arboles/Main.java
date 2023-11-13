package arboles;

public class Main {
    public static void main(String[] args) {

        // Creando el árbol ordinario desde la raíz
        Arbol<Character> arbolPrincipal = new Arbol<Character>('A', false);
        NodoArbol<Character> raiz = arbolPrincipal.obtenerRaiz();
        
        // Añadiendo el segundo nivel del árbol
        NodoArbol<Character> nodoB = new NodoArbol<Character>('B');
        arbolPrincipal.agregarNodoArbol(raiz, nodoB);
        NodoArbol<Character> nodoC = new NodoArbol<Character>('C');
        arbolPrincipal.agregarNodoArbol(raiz, nodoC);
        NodoArbol<Character> nodoD = new NodoArbol<Character>('D');
        arbolPrincipal.agregarNodoArbol(raiz, nodoD);
        
        // Añadiendo el tercer nivel del árbol
        NodoArbol<Character> nodoE = new NodoArbol<Character>('E');
        arbolPrincipal.agregarNodoArbol(nodoB, nodoE);
        NodoArbol<Character> nodoF = new NodoArbol<Character>('F');
        arbolPrincipal.agregarNodoArbol(nodoB, nodoF);
        
        NodoArbol<Character> nodoG = new NodoArbol<Character>('G');
        arbolPrincipal.agregarNodoArbol(nodoD, nodoG);
        NodoArbol<Character> nodoH = new NodoArbol<Character>('H');
        arbolPrincipal.agregarNodoArbol(nodoD, nodoH);
        NodoArbol<Character> nodoI = new NodoArbol<Character>('I');
        arbolPrincipal.agregarNodoArbol(nodoD, nodoI);
        
        // Añadiendo el cuarto nivel del árbol
        NodoArbol<Character> nodoJ = new NodoArbol<Character>('J');
        arbolPrincipal.agregarNodoArbol(nodoF, nodoJ);
        NodoArbol<Character> nodoK = new NodoArbol<Character>('K');
        arbolPrincipal.agregarNodoArbol(nodoF, nodoK);
        NodoArbol<Character> nodoL = new NodoArbol<Character>('L');
        arbolPrincipal.agregarNodoArbol(nodoF, nodoL);
        
        NodoArbol<Character> nodoM = new NodoArbol<Character>('M');
        arbolPrincipal.agregarNodoArbol(nodoG, nodoM);
        
        NodoArbol<Character> nodoN = new NodoArbol<Character>('N');
        arbolPrincipal.agregarNodoArbol(nodoI, nodoN);
        NodoArbol<Character> nodoO = new NodoArbol<Character>('O');
        arbolPrincipal.agregarNodoArbol(nodoI, nodoO);
        
        // Añadiendo el quinto nivel del árbol
        NodoArbol<Character> nodoP = new NodoArbol<Character>('P');
        arbolPrincipal.agregarNodoArbol(nodoM, nodoP);
        NodoArbol<Character> nodoQ = new NodoArbol<Character>('Q');
        arbolPrincipal.agregarNodoArbol(nodoM, nodoQ);

        // Imprimiendo el árbol
        arbolPrincipal.imprimirArbol(Recorrido.PREFIJO);
        arbolPrincipal.imprimirArbol(Recorrido.INFIJO);
        arbolPrincipal.imprimirArbol(Recorrido.POSFIJO);
    }
}