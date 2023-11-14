package Arboles;

public class Main {
    public static void main(String[] args) {

        // CREANDO EL ÁRBOL GENERAL
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

        // Imprimiendo el árbol general...
        System.out.println("=== Arbol general ===");
        arbolPrincipal.imprimirArbol(Recorrido.PREFIJO);
        arbolPrincipal.imprimirArbol(Recorrido.INFIJO);
        arbolPrincipal.imprimirArbol(Recorrido.POSFIJO);
        System.out.println("");
        
        // CREANDO EL ÁRBOL BINARIO
        Arbol<Character> arbolBinario = new Arbol<Character>('A', true);
        NodoArbol<Character> raizBin = arbolBinario.obtenerRaiz();
        
        // Añadiendo el segundo nivel del árbol
        NodoArbol<Character> B = new NodoArbol<Character>('B');
        arbolBinario.agregarNodoArbol(raizBin, B);
        
        // Añadiendo el tercer nivel del árbol
        NodoArbol<Character> E = new NodoArbol<Character>('E');
        arbolBinario.agregarNodoArbol(B, E);
        
        NodoArbol<Character> C = new NodoArbol<Character>('C');
        arbolBinario.agregarNodoArbol(B, C);
        
        // Añadiendo el cuarto nivel del árbol
        NodoArbol<Character> F = new NodoArbol<Character>('F');
        arbolBinario.agregarNodoArbol(E, F);
        
        NodoArbol<Character> D = new NodoArbol<Character>('D');
        arbolBinario.agregarNodoArbol(C, D);
        
        // Añadiendo el quinto nivel del árbol
        NodoArbol<Character> J = new NodoArbol<Character>('J');
        arbolBinario.agregarNodoArbol(F, J);
        
        NodoArbol<Character> G = new NodoArbol<Character>('G');
        arbolBinario.agregarNodoArbol(D, G);
        
        // Añadiendo el sexto nivel del árbol
        NodoArbol<Character> K = new NodoArbol<Character>('K');
        arbolBinario.agregarNodoArbol(J, K);
        
        NodoArbol<Character> M = new NodoArbol<Character>('M');
        arbolBinario.agregarNodoArbol(G, M);
        NodoArbol<Character> H = new NodoArbol<Character>('H');
        arbolBinario.agregarNodoArbol(G, H);
        
        // Añadiendo el séptimo nivel del árbol
        NodoArbol<Character> L = new NodoArbol<Character>('L');
        arbolBinario.agregarNodoArbol(K, L);
        
        NodoArbol<Character> P = new NodoArbol<Character>('P');
        arbolBinario.agregarNodoArbol(M, P);
        
        NodoArbol<Character> I = new NodoArbol<Character>('I');
        arbolBinario.agregarNodoArbol(H, I);
        
        // Añadiendo el octavo nivel del árbol
        NodoArbol<Character> Q = new NodoArbol<Character>('Q');
        arbolBinario.agregarNodoArbol(P, Q);
        
        NodoArbol<Character> N = new NodoArbol<Character>('N');
        arbolBinario.agregarNodoArbol(I, N);
        
        // Añadiendo el noveno nivel del árbol
        NodoArbol<Character> O = new NodoArbol<Character>('O');
        arbolBinario.agregarNodoArbol(N, O);
        
        // Imprimiendo el árbol binario...
        System.out.println("=== Arbol binario ===");
        arbolBinario.imprimirArbol(Recorrido.PREFIJO);
        arbolBinario.imprimirArbol(Recorrido.INFIJO);
        arbolBinario.imprimirArbol(Recorrido.POSFIJO);

        // Obteniendo la altura del árbol
        System.out.println();
        System.out.println("Altura del árbol binario: ");
        System.out.println(arbolBinario.obtenerAltura(raizBin));

        // Imprimiendo los subárboles
        System.out.println();
        arbolBinario.imprimirSubArbol(nodoB, Recorrido.PREFIJO);
        arbolBinario.imprimirSubArbol(nodoD, Recorrido.INFIJO);
        arbolBinario.imprimirSubArbol(nodoG, Recorrido.POSFIJO);

    }
}