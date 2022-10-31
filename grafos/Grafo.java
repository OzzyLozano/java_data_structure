package grafos;

public class Grafo {
  Vertice grafo;
  int indice;
  Arista arista;

  boolean isEmpty() {
    if (grafo == null) return true;
    else return false;
  }

  void add(int n) {
    if (!isEmpty()) {
      grafo.enlace.add(n);
    } else {
      Vertice temp = new Vertice();
      temp.vertice = n;
      temp.enlace = new Grafo();
      grafo = temp;
      System.out.println("vertice " + n + " agregado");
      indice++;
    }
  }

  void show() {
    if (!isEmpty()) {
      System.out.print(grafo.vertice + " ");
      grafo.enlace.show();
    } else {
      System.out.println("");
    }
  }

  void buscar(int n) {
    if (!isEmpty()) {
      if (n == grafo.vertice) {
        System.out.println("vertice encontrado");
      } else {
        grafo.enlace.buscar(n);
      }
    } else {
      System.out.println("vertice no encontrado");
    }
  }

  void cantidad() {
    System.out.println("cantidad de vertices: " + indice);
  }

  boolean emptyArista() {
    return arista == null;
  }

  void addArista(int n, int m) {
    if (!emptyArista()) {
      arista.enlace.addArista(n, m);
    } else {
      Arista temp = new Arista();
      temp.arista = true;
      temp.x = n;
      temp.y = m;
      temp.enlace = new Grafo();
      arista = temp;
      System.out.println("arista creada uniendo los vertices " + n + " y " + m);
    }
  }

  void mostrarAristas() {
    if (!emptyArista()) {
      System.out.println("arista uniendo " + arista.x + " y " + arista.y);
      arista.enlace.mostrarAristas();
    }
  }

  // void dirigir(int n, int m) {
  //   if (!isEmpty()) {
  //     grafo.vinculo[n][m] = true;
  //   } else {
  //     System.out.println("no existe alguno de esos numeros");
  //   }
  // }

  // void comprobarVinculo(int n, int m) {
  //   if (!isEmpty() && grafo.vinculo[n][m]) {
  //     System.out.println("existe vinculo");
  //   } else {
  //     System.out.println("no existe vinculo o alguno de esos numeros.");
  //   }
  // }

  // void imprimirTablaVinculos() {
  //   for (int i = 0; i < 10; i++) {
  //     for (int j = 0; j < 10; j++) {
  //       if (grafo.vinculo[i][j]) {
  //         System.out.print(1 + " ");
  //       } else {
  //         System.out.print(0 + " ");
  //       }
  //     }
  //     System.out.println("");
  //   }
  // }

}
