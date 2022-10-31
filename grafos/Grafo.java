package grafos;

public class Grafo {
  Vertice grafo;
  int indice, c = -1;
  Arista arista;

  boolean isEmpty() {
    return grafo == null;
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
    }
    indice++;
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

  boolean contains(int n) {
    if (!isEmpty()) {
      if (n == grafo.vertice) {
        return true;
      } else {
        grafo.enlace.contains(n);
        return grafo.enlace.contains(n);
      }
    } else {
      return false;
    }
  }

  void cantidad() {
    System.out.println("cantidad de vertices: " + indice);
  }

  int obtIndice(int n) {
    c++;
    if (!isEmpty()) {
      if (n == grafo.vertice) {
        return c;
      } else {
        return grafo.enlace.obtIndice(n) + 1;
      }
    }
    return c;
  }

  boolean emptyArista() {
    return arista == null;
  }

  void addArista(int n, int m) {
    if (contains(n) && contains(m) && !emptyArista()) {
      arista.enlace.addArista(n, m);
    } else if (emptyArista()) {
      Arista temp = new Arista();
      temp.arista = true;
      temp.x = n;
      temp.y = m;
      temp.enlace = new Grafo();
      arista = temp;
      System.out.println("arista creada uniendo los vertices " + n + " y " + m);
    } else if (!contains(n)) {
      System.out.println("no existe el vertice " + n);
    } else if (!contains(m)) {
      System.out.println("no existe el vertice " + m);
    }
  }

  void mostrarAristas() {
    if (!emptyArista()) {
      System.out.println("arista uniendo " + arista.x + " y " + arista.y);
      arista.enlace.mostrarAristas();
    }
  }

  void comprobarArista(int n, int m) {
    if (!emptyArista()) {
      if (arista.x == n && arista.y == m) {
        System.out.println("hay conexion entre " + n + " y " + m);
      } else {
        arista.enlace.comprobarArista(n, m);
      }
    } else {
      System.out.println("no hay conexion entre " + n + " y " + m);
    }
  }

  void matrizA() {
    
  }

}
