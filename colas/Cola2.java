package colas;

import java.util.Scanner;

/*
 * 1 insertar inicio
 * 2 insertar final
 * 3 eliminar primero
 * 4 eliminar ultimo
 * 5 mostrar todos
 * 6 borrar todos
 * 7 salir
 */

public class Cola2 {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    println("menu: ");
    println("1. ingresar al inicio");
    println("2. ingresar al final");
    println("3. eliminar primero");
    println("4. eliminar final");
    println("5. mostrar todos los elementos");
    println("6. borrar todos los elementos");
    println("7. salir");
    doWhile(read.nextInt());
    read.close();
  }

  static void doWhile(int op) {
    do {
      
    } while (op < 1 && op > 7);
  }

  static void println(String s) {
    System.out.println(s);
  }
}
