package metodos_ordenamiento.ordenamiento_burbuja;

public class metodo_burbuja {
  public static void main(String[] args) {
    int unordered_array[] = new int[10];
    for (int i = 0; i < unordered_array.length; i++) {
      unordered_array[i] = (int)(Math.random() * 121);
    }
    int aux;
    for (int i = 0; i < unordered_array.length; i++) {
      for (int j = 0; j < (unordered_array.length - 1); j++) {
        if (unordered_array[j] > unordered_array[j+1]) {
          aux = unordered_array[j];
          unordered_array[j] = unordered_array[j+1];
          unordered_array[j+1] = aux;
        }
      }
    }
    System.out.println("vector ordenado: ");
    for (int i : unordered_array) {
      System.out.println(i);
    }
  }
}
