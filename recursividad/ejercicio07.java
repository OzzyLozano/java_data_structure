package recursividad;

import java.util.Scanner;

public class ejercicio07 {
  int inverso;
  public static void main(String[] args) {
    ejercicio07 ex = new ejercicio07();
    Scanner read = new Scanner(System.in);
    System.out.println("ingresa un numerito c:");
    int n = read.nextInt();
    ex.num_inverso(n);
    read.close();
  }

  void num_inverso(int n) {
    System.out.print(n%10);
    if(n/10 != 0) num_inverso(n / 10);
    else System.out.println();
  }
}
