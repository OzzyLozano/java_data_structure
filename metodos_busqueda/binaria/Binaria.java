package metodos_busqueda.binaria;

import java.util.Random;
import java.util.Scanner;

public class Binaria {
  public static void main(String[] args) {
    int array[] = new int[10];
    Random rand = new Random();
    Scanner read = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.print("ingrese un numero: ");
      array[i] = read.nextInt();
    }
    ordenamientoBurbuja(array);
    System.out.print("ingrese elemento a buscar: ");
    int n = read.nextInt();
    read.close();
    int inf = 0, sup = array.length - 1;
    busquedaBinaria(array, n, inf, sup);
  }

  static void busquedaBinaria(int[] array, int n, int inf, int sup) {
    int half = (inf + sup) / 2;
    if (n == array[half]) System.out.println("numero encontrado");
    else if (n < array[half]) {
      sup = half;
      busquedaBinaria(array, n, inf, sup);
    } else if (n > array[half]) {
      inf = half;
      busquedaBinaria(array, n, inf, sup);
    }
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
