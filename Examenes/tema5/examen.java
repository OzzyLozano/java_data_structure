package Examenes.tema5;

import java.util.Random;
import java.util.Scanner;

public class examen {
  public static void main(String[] args) {
    int v[] = new int[12];
    Scanner read = new Scanner(System.in);
    for (int i = 0; i < v.length; i++) {
      System.out.print("ingrese un numero: ");
      v[i] = read.nextInt();
    }
    System.out.println("vector sin ordenar: ");
    for (int n : v) {
      System.out.println(n);
    }
    quicksort(v, 0, (v.length - 1));
    System.out.println("vetor ordenado uwu: ");
    for (int n : v) {
      System.out.println(n);
    }
  }

  private static void quicksort(int[] v, int first, int last) {
    int i = first, j = last, aux, pivote = v[(first + last)/2];
    while (i <= j) {
      while (v[i] < pivote) i++;
      while (v[j] > pivote) j--;
      if (i <= j) {
        aux = v[j];
        v[j] = v[i];
        v[i] = aux;
        i++;
        j--;
      }
      if (first < j) quicksort(v, first, j);
      if (last > i) quicksort(v, i, last);
    }
  }
}
