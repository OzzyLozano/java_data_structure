package grafos.grafo1;

public class GrafoDirigido {
  int nodos[] = new int[15];
  int aristas[][] = new int[15][15];
  int indice;

  GrafoDirigido() {
    indice = -1;
  }

  boolean emptyV() {
    return (indice == -1);
  }

  boolean numIn(int n) {
    for (int i = 0; i < (indice + 1); i++) if (n == nodos[i]) return true;
    return false;
  }

  void addV(int n) {
    if (!numIn(n)) {
      indice++;
      nodos[indice] = n;
      System.out.println("number " + nodos[indice] + " added");
    } else {
      System.out.println("cant add same value twice");
    }
  }

  void show() {
    System.out.print("vertices: \n   ");
    for (int i = 0; i < (indice + 1); i++) {
      System.out.print("  " + nodos[i]);
    }
    System.out.println();
  }

  void addA(int n, int m) {
    if (numIn(n) && numIn(m)) {
      for (int i = 0; i < (indice + 1); i++) {
        for (int j = 0; j < (indice + 1); j++) {
          if (nodos[i] == n && nodos[j] == m) {
            aristas[i][j] = 1;
          }
        }
      }
    } else {
      System.out.println("a number was not found, check the array again");
      show();
    }
  }

  void printMatrix() {
    System.out.println("this is your matrix: ");
    show();
    for (int i = 0; i < (indice + 1); i++) {
      System.out.print(nodos[i] + " -> ");
      for (int j = 0; j < (indice + 1); j++) {
        System.out.print(aristas[i][j] + "  ");
      }
      System.out.println();
    }
  }

}
