package clases_repaso;

import java.util.Scanner;

public class ejercicio04 {
  public static void main(String[] args) {
    int pares = 0, impares = 0;
    System.out.println("ingrese cantidad de numeros q desea dar: ");
    Scanner read = new Scanner(System.in);
    int n = read.nextInt();
    int[] arreglo = new int[n];
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println("ingrese el dato " + (i + 1) + ":");
      arreglo[i] = read.nextInt();
    }
    for (int i = 0; i < arreglo.length; i++) {
      if((arreglo[i] % 2) == 0) pares += arreglo[i];
      else impares += arreglo[i];
    }
    System.out.println("sumatoria numeros pares: " + pares);
    System.out.println("sumatoria numeros impares: " + impares);
  }
}
