package metodos_ordenamiento.shellsort;

public class Shellsort {
  public static void main(String[] args) {
    int v[] = new int[12];
    for (int i = 0; i < v.length; i++) {
      v[i] = (int)(Math.random()*100);
    }
    shellsort(v);
    for (int x : v) {
      System.out.println(x);
    }
  }

  static void shellsort(int[] v) {
    int n = v.length;
    int aux, i, j, k;
    int intervalo = n/2;
    while (intervalo > 0) {
      for (i = intervalo; i < n; i++) {
        j = i - intervalo;
        while (j >= 0) {
          k = j + intervalo;
          if (v[j] <= v[k]) {
            j = -1;
          } else {
            aux = v[j];
            v[j] = v[k];
            v[k] = aux;
            j -= intervalo;
          }
        }
      }
      intervalo = intervalo / 2;
    }
  }

}
