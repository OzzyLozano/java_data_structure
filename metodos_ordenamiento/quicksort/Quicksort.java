package metodos_ordenamiento.quicksort;

public class Quicksort {
  public static void main(String[] args) {
    int v[] = new int[10];
    for (int i = 0; i < v.length; i++) {
      v[i] = (int)(Math.random()*100);
    }
    quicksort(v, 0, (v.length - 1));
    for (int x : v) {
      System.out.println(x);
    }
  }

  static void quicksort(int[] vec, int first, int last) {
    int i = first, j = last, aux;
    int pivote = vec[(first + last) / 2];;
    do {
      while (vec[i] < pivote) i++;
      while (vec[j] > pivote) j--;
      if (i <= j) {
        aux = vec[j];
        vec[j] = vec[i];
        vec[i] = aux;
        i++;
        j--;
      }
    } while (i <= j);
    if (first < j) quicksort(vec, first, j);
    if (last > i) quicksort(vec, i, last);
  }

}
