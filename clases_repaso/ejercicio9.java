package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio9 {
  static Scanner read = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("ingrese un numero entero:");
    int num = read.nextInt();
    if (esPar(num) == 0) System.out.println("es par");
    else System.out.println("no es par");
  }
  private static int esPar(int n) {
    if (n % 2 == 0) return 0;
    else return 1;
  }
}
