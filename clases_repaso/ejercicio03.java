package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio03 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int arreglo[] = new int[5];
    for (int i = 0; i < arreglo.length; i++) {
      System.out.println("ingresa el dato " + (i + 1) + ":");
      arreglo[i] = read.nextInt();
    }
    int greaterNum = 0;
    for (int i = 0; i < arreglo.length; i++) {
      if (greaterNum < arreglo[i]) {
        greaterNum = arreglo[i];
      }
    }
    System.out.println("el numero mayor es " + greaterNum);
  }
}
