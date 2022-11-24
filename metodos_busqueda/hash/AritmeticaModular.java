package metodos_busqueda.hash;

import java.util.Random;

public class AritmeticaModular {
  static int array[] = new int[20];
  public static void main(String[] args) {
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(100, 999);
    }
    ordenamientoBurbuja(array);
    for (int x : array) {
      System.out.println(x);
    }
    int clave = array[rand.nextInt(0, (array.length - 1))]; // pongo como clave una posicion aleatoria del array
    System.out.println("se busco el elemento " + clave + " y fue hallado en la posicion " + aritmeticaModular(clave));
  }

  static int aritmeticaModular(int clave) {
    return (clave % array.length);
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
