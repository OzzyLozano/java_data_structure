package recursividad;

import java.util.Scanner;

public class ejercicio05 {
  static int num1 = 0, num2 = 1, num3, i = 1;
  int counter;
  public static void main(String[] args) {
    ejercicio05 ej5 = new ejercicio05();
    Scanner read = new Scanner(System.in);
    System.out.print("ingrese el numero d veces a repetir la serie: ");
    ej5.counter = read.nextInt();
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
      if (i <= counter) System.out.println("fin c:");
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
