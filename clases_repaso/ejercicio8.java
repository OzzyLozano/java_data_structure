package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio8 {
  static Scanner read = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("el costo es de: " + calcDesc(pedirCosto()) + " (descuento ya aplicado)");
  }
  private static double calcDesc(double x) {
    if (x >= 2500) return x * .85;
    else return x * .92;
  }
  private static double pedirCosto() {
    System.out.println("ingrese el costo del traje:");
    double costo = read.nextDouble();
    return costo;
  }
}
