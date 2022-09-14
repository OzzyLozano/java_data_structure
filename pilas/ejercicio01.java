package pilas;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio01 {
  public static void main(String[] args) {
    Stack pilas = new Stack<>();
    Scanner read = new Scanner(System.in);

    System.out.print("ingrese un numero: ");
    int num = read.nextInt();

    pilas.push(num);
    pilas.push(69);
    pilas.push(10);
    
    System.out.println(pilas);
    pilas.pop();
    System.out.println(pilas);
  }
}
