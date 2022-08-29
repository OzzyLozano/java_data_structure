package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int[][] arreglo = new int[5][5];
    int num_mayor = 0;
    for (int i = 0; i < arreglo.length; i++) {
      for (int j = 0; j < arreglo.length; j++) {
        System.out.println("ingrese");
        arreglo[i][j] = read.nextInt();
        if (i == 0 && j == 0) num_mayor = arreglo[i][j];
        else (num_mayor < arreglo[i][j]) num_mayor = arreglo[i][j];
      }
    }
    System.out.println("el numero mayor es: " + num_mayor);
  }
}
