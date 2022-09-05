package clases_repaso;

import java.util.Scanner;

public class ejercicio05 {
  public static void main(String[] args) {
    int row = 3, column = 2;
    int[][] arreglo = new int[row][column];
    Scanner read = new Scanner(System.in);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("ingrese un numero: ");
        arreglo[i][j] = read.nextInt();
      }
    }
    System.out.println("esta es tu lista:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println(arreglo[i][j]);
      }
    }
  }
}
