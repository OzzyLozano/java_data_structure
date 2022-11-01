package Examenes.tema4;

public class ArbolBinario {
  Nodo raiz;

  boolean isEmpty() {
    return raiz == null;
  }

  void add(int n) {
    if (isEmpty()) {
      Nodo temp = new Nodo();
      temp.dato = n;
      temp.hizq = new ArbolBinario();
      temp.hder = new ArbolBinario();
      raiz = temp;
      System.out.println("elemento agregado");
    } else {
      if (n > raiz.dato) {
        raiz.hder.add(n);
      }
      if (n < raiz.dato) {
        raiz.hizq.add(n);
      }
    }
  }

  void enOrden() {
    if (!isEmpty()) {
      raiz.hizq.enOrden();
      System.out.print(raiz.dato + ", ");
      raiz.hder.enOrden();
    }
  }

  void buscar(int n) {
    if (isEmpty()) {
      System.out.println("no se encontro el elemento");
    } else {
      if (n == raiz.dato) {
        System.out.println("elemento encontrado");
      } else {
        if (n > raiz.dato) {
          raiz.hder.buscar(n);
        } else {
          raiz.hizq.buscar(n);
        }
      }
    }
  }

  int altura() {
    if (!isEmpty()) return (Math.max(raiz.hizq.altura(), raiz.hder.altura()) + 1);
    else return 0;
  }

}
