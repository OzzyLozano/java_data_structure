package grafos.prueba;

public class Arista {
  boolean arista;
  Grafo enlace;
  int x, y;

  Arista() {
    arista = false;
    enlace = null;
    x = 0;
    y = 0;
  }

  void matriz(int indice) {
    int A[][] = new int[indice][indice];
    for (int i = 0; i < indice; i++) {
      for (int j = 0; j < indice; j++) {
        if (j == 0) {
          System.out.print(" -> ");
        }
        System.out.print(A[i][j] + "  ");
      }
      System.out.println();
    }
  }

}
