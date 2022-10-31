package arboles.arbol1;

public class ArbolBinario {

  nodo raiz;

  boolean isEmpty() {
    if (raiz == null) return true;
    else return false;
  }

  void add(int element) {
    if (isEmpty()) {
      nodo nuevo_nodo = new nodo();
      nuevo_nodo.dato = element;
      nuevo_nodo.hder = new ArbolBinario();
      nuevo_nodo.hizq = new ArbolBinario();
      raiz = nuevo_nodo;
    }
    else {
      if (element < raiz.dato) {
        (raiz.hizq).add(element);
      }
      if (element > raiz.dato) {
        (raiz.hder).add(element);
      }
    }
  }

  ArbolBinario buscar(int n) {
    ArbolBinario arbolito = null;
    if (!isEmpty()) {
      if (n == raiz.dato) {
        System.out.println("elemento encontrado");
        return this;
      }
      else {
        if (raiz.dato > n) arbolito = raiz.hizq.buscar(n);
        else arbolito = raiz.hder.buscar(n);
      }
    }
    return arbolito;
  }

  void remove(int n) {
    ArbolBinario elim = buscar(n);
    if (!elim.isEmpty()) {
      if (elim.esHoja()) elim.raiz = null;
      else {
        if (!elim.isEmpty() && !elim.isEmpty()) 
          elim.raiz.dato = elim.raiz.hizq.buscarMayor();
        else {
          if (elim.raiz.hizq.isEmpty())
            elim.raiz = elim.raiz.hder.raiz;
          else
            elim.raiz = elim.raiz.hizq.raiz;
        }
      }
    }
  }

  void preOrden() {
    if (!isEmpty()) {
      System.out.print(raiz.dato + ", ");
      raiz.hizq.preOrden();
      raiz.hder.preOrden();
    }
  }

  void enOrden() {
    if (!isEmpty()) {
      raiz.hizq.enOrden();
      System.out.print(raiz.dato + ", ");
      raiz.hder.enOrden();
    }
  }

  void postOrden() {
    if (!isEmpty()) {
      raiz.hder.postOrden();
      raiz.hizq.postOrden();
      System.out.print(raiz.dato + ", ");
    }
  }

  /* 
   void buscarNum(int n) {
     if (!isEmpty()) {
       if (raiz.dato == n) System.out.println("elmento encontrado");
       else if (n < raiz.dato) raiz.hizq.buscarNum(n);
       else if (n > raiz.dato) raiz.hder.buscarNum(n);
      }
      else System.out.println("elemento no encontrado");
    }
  */

  int cantidad() {
    if (!isEmpty()) return (raiz.hder.cantidad() + raiz.hizq.cantidad() + 1);
    else return 0;
  }

  int altura() {
    if (!isEmpty()) return (Math.max((raiz.hizq.altura()), (raiz.hder.altura())) + 1);
    else return 0;
  }

  int nivel() {
    return (altura() - 1);
  }

  int buscarMenor() {
    ArbolBinario arbolActual = this;
    while (!arbolActual.raiz.hizq.isEmpty()) arbolActual = arbolActual.raiz.hizq;
    int r = arbolActual.raiz.dato;
    arbolActual.raiz = null;
    return r;
  }

  int buscarMayor() {
    ArbolBinario arbolActual = this;
    while (!arbolActual.raiz.hder.isEmpty()) arbolActual = arbolActual.raiz.hder;
    int r = arbolActual.raiz.dato;
    arbolActual.raiz = null;
    return r;
  }

  boolean esHoja() {
    boolean hoja = false;
    if ((raiz.hizq).isEmpty() && (raiz.hder).isEmpty()) hoja = true;
    return hoja;
  }

}
