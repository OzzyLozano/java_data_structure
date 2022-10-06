package colas;

public class Cola2 {
  int v[] = new int[50];
  int i;

  Cola2() {
    i = -1;
  }

  void insIni(int n) {
    if (i == -1) {
      i++;
      v[i] = n;
    }
    else {
      for (int j = i; j < -1; j--) {
        v[(j + 1)] = v[j];
      }
      v[0] = n;
      i++;
    }
  }

  void insEnd(int n) {
    i++;
    v[i] = n;
  }

  void elimPrimero() {
    for (int j = 0; j <= i; j++) {
      v[j] = v[(j + 1)];
    }
    i--;
  }

  void elimUltimo() {
    i--;
  }

  void mostrar() {
    for (int j = 0; j <= i; j++) {
      System.out.println(v[j]);
    }
  }

  void borrar() {
    i = -1;
  }

}
