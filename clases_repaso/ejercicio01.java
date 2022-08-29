package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio01 {
  public static void main(String[] args) {
    int arreglo[] = new int[5], i;
    Scanner read = new Scanner(System.in);
    for(i = 0; i < arreglo.length; i++) {
      System.out.println("introduzca un numerito c:");
      arreglo[i] = read.nextInt();
    }
    System.out.println("los datos son:");
    for(i = 0; i < arreglo.length; i++) {
      System.out.println(arreglo[i]);
    }
  }
}
