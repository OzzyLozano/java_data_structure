package metodos_busqueda.hash;

import java.util.Random;

public class Multiplicacion {
  static int array[] = {100, 294, 305, 408, 609, 769, 981};
  public static void main(String[] args) {
    Random rand = new Random();
    ordenamientoBurbuja(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println((i + 1) + ". " + array[i]);
    }
    int clave = array[rand.nextInt(0, (array.length - 1))];
    System.out.println("se busco el elemento " + clave + " y fue hallado en la posicion " + multiplicacion(clave));
  }

  static int multiplicacion(int clave) {
    final double A = (Math.sqrt(5) - 1) / 2;
    double d = (A * clave) - (Math.floor(A * clave));
    return (int)(array.length * d);
  }

  static void ordenamientoBurbuja(int[] unordered_array) {
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
  }

}
