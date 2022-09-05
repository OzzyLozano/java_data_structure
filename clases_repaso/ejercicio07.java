package clases_repaso;
import java.util.Scanner;

public class ejercicio07 {
  static Scanner read = new Scanner(System.in);
  static int num;
  public static void main(String[] args) {
    System.out.println("el triple es: " + triple(pedir()));
  }

  private static int triple(int x) {
    int num = x * 3;
    return num;
  }

  private static int pedir() {
    System.out.println("ingrese un numero:");
    num = read.nextInt();
    return num;
  }
}
