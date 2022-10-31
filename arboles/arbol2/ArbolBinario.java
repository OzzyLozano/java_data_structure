package arboles.arbol2;

public class ArbolBinario {
  Nodo raiz;
  int hijoI, hijoD, mayorHI, menorHD;

  boolean isEmpty() {
    if (raiz == null) return true;
    else return false;
  }

  void add(int n) {
    if(isEmpty()) {
      Nodo a = new Nodo();
      a.data = n;
      a.hD = new ArbolBinario();
      a.hI = new ArbolBinario();
      raiz = a;
    }
    else {
      if (n > raiz.data) raiz.hD.add(n);
      if (n < raiz.data) raiz.hI.add(n);
    }
  }

  void preOrden() {
    if (!isEmpty()) {
      System.out.print(raiz.data + " ");
      raiz.hI.preOrden();
      raiz.hD.preOrden();
    }
  }

  void enOrden() {
    if (!isEmpty()) {
      raiz.hI.enOrden();
      System.out.print(raiz.data + " ");
      raiz.hD.enOrden();
    }
  }

  void postOrden() {
    if (!isEmpty()) {
      raiz.hD.postOrden();
      raiz.hI.postOrden();
      System.out.print(raiz.data + " ");
    }
  }

  int alturaArbol() {
    if (!isEmpty()) return (Math.max((raiz.hI.alturaArbol()), (raiz.hD.alturaArbol())) + 1);
    else return 0;
  }

  int alturaLadoI() {
    hijoI = raiz.hI.alturaArbol();
    return hijoI;
  }

  int alturaLadoD() {
    hijoD = raiz.hD.alturaArbol();
    return hijoD;
  }

  int balance() {
    hijoI = raiz.hI.alturaArbol();
    hijoD = raiz.hD.alturaArbol();
    return hijoI - hijoD;
  }

  boolean isBalanced() {
    if (balance() <= 1 && balance() >= -1) return true;
    else return false;
  }

  int buscarMenor() {
    ArbolBinario arbolActual = this;
    while (!arbolActual.raiz.hI.isEmpty()) arbolActual = arbolActual.raiz.hI;
    int r = arbolActual.raiz.data;
    arbolActual.raiz = null;
    return r;
  }

  int buscarMayor() {
    ArbolBinario arbolActual = this;
    while (!arbolActual.raiz.hD.isEmpty()) arbolActual = arbolActual.raiz.hD;
    int r = arbolActual.raiz.data;
    arbolActual.raiz = null;
    return r; 
  }

  ArbolBinario buscar(int n) {
    ArbolBinario arbolito = new ArbolBinario();
    if (!isEmpty()) {
      if (n == raiz.data) {
        System.out.println("elemento encontrado");
        return this;
      }
      else {
        if (raiz.data > n) arbolito = raiz.hI.buscar(n);
        else arbolito = raiz.hD.buscar(n);
      }
    }
    return arbolito;
  }

  void remove(int n) {
    ArbolBinario elim = buscar(n);
    if (!elim.isEmpty()) {
      if (elim.esHoja()) {
        elim.raiz = null;
      } else {
        if (!elim.isEmpty()) {
          elim.raiz.data = elim.raiz.hI.buscarMayor();
        } else {
          if (elim.raiz.hI.isEmpty()) {
            elim.raiz = elim.raiz.hD.raiz;
          } else {
            elim.raiz = elim.raiz.hI.raiz;
          }
        }
      }
    }
  }

  boolean esHoja() {
    boolean hoja = false;
    if ((raiz.hI).isEmpty() && (raiz.hD).isEmpty()) hoja = true;
    return hoja;
  }

  int buscarMayorHI() {
    mayorHI = raiz.hI.buscarMayor();
    return mayorHI;
  }

  int buscarMenorHD() {
    menorHD = raiz.hD.buscarMenor();
    return menorHD;
  }

  // void balancear() {
  //   if (!isEmpty()) {
  //     if (!isBalanced()) {
  //       int n;
  //       if (balance() > 1) {
  //         n = raiz.hI.buscarMayor();
  //       } else {
  //         System.out.println("el lado der contiene mas elementos");
  //       }
  //     } else {
  //       System.out.println("arbol ya balanceado");
  //     }
  //   } else {
  //     System.out.println("no hay arbol");
  //   }
  // }

}
