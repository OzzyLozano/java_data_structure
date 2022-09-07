package recursividad;

import java.util.Scanner;

public class ejercicio02 {
  public static void main(String[] args) {
    ejercicio02 ex = new ejercicio02();
    Scanner read = new Scanner(System.in);
    System.out.println("ingrese un numero");
    int x = read.nextInt();
    ex.print(x);
    read.close();
  }

  void print(int x) {
    if (x > 0) {
      System.out.println(x);
      print(x - 1);
    } else if(x < 0) {
      System.out.println(x);
      print(x + 1);
    } else System.out.println(x);
  }
}
