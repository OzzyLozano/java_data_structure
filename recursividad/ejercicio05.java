package recursividad;

import java.util.Scanner;

public class ejercicio05 {
  static long num1 = 0, num2 = 1, num3, i = 1;
  long counter;
  public static void main(String[] args) {
    ejercicio05 ej5 = new ejercicio05();
    Scanner read = new Scanner(System.in);
    do {
      System.out.print("ingrese el numero d veces a repetir la serie: ");
      ej5.counter = read.nextInt();
    } while (ej5.counter > 93); // cuando llega al 94 los numeros aparecen negativos
    ej5.fibonacci();
    read.close();
  }

  void fibonacci() {
    if (i == 1) {
      System.out.println(i + "." + num1);
      i++;
      fibonacci();
    }
    else if (i == 2) {
      System.out.println(i + "." + num2);
      i++;
      fibonacci();
    }
    else{
      if (i > counter) System.out.println("fin c:");
      else {
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        System.out.println(i + "." + num3);
        i++;
        fibonacci();
      }
    }
  }
}
