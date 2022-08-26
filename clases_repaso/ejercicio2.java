package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    int vector[] = new int[5], i;
    float promedio = 0;
    Scanner read = new Scanner(System.in);
    for (i = 0; i < vector.length; i++) {
      System.out.println("introduzca un numerito c:");
      vector[i] = read.nextInt();
      promedio += vector[i];
    }
    promedio /= vector.length;
    System.out.println("el promedio es: " + promedio);
  }
}
