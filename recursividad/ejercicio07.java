package recursividad;

import java.util.Scanner;

public class ejercicio07 {
  long inverso;
  public static void main(String[] args) {
    ejercicio07 ex = new ejercicio07();
    Scanner read = new Scanner(System.in);
    System.out.println("ingresa un numerito c:");
    long n = read.nextLong();
    ex.num_inverso(n);
    System.out.println(ex.inverso);
    read.close();
  }

  void num_inverso(long n) {
    inverso += n%10;
    if(n/10 != 0) {
      inverso*= 10;
      num_inverso(n / 10);
    }
    else System.out.print("tu numero al reves es: ");
  }
}
