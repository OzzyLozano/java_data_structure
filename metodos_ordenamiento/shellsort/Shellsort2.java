package metodos_ordenamiento.shellsort;

public class Shellsort2 {
  public static void main(String[] args) {
    int v[] = new int[10];
    for (int i = 0; i < v.length; i++) {
      v[i] = (int)(Math.random()*100);
    }
    shellsort(v);
    for (int num : v) {
      System.out.println(num);
    }
  }

  static void shellsort(int[] v) {
    int n = v.length;
    int incremento = n;
    do {
      incremento = incremento / 2;
      for (int k = 0; k < incremento; k++) {
        for (int i = incremento; i < n; i++) {
          int j = i;
          while ((j - incremento) >= 0 && v[j] < v[j - incremento]) {
            int aux = v[j];
            v[j] = v[j - incremento];
            v[j - incremento] = aux;
            j -= incremento;
          }
        }
      }
    } while (incremento > 1);

  }
}
