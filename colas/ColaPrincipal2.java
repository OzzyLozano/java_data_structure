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

public class ColaPrincipal2 {
  static Scanner read = new Scanner(System.in);
  static Cola2 cola = new Cola2();
  public static void main(String[] args) {
    printMenu();
    println("elija una opcion: ");
    switchCase(read.nextInt());
    read.close();
  }

  private static void printMenu() {
    println("menu: ");
    println("1. ingresar al inicio");
    println("2. ingresar al final");
    println("3. eliminar primero");
    println("4. eliminar final");
    println("5. mostrar todos los elementos");
    println("6. borrar todos los elementos");
    println("7. salir");
  }

  static void switchCase(int op) {
    switch (op) {
      case 1:
        println("ingrese el dato: ");
        cola.insIni(read.nextInt());
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;
      
      case 2:
        println("ingrese el dato: ");
        cola.insEnd(read.nextInt());
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;
      
      case 3:
        println("eliminando primer elemento...");
        cola.elimPrimero();
        println("elemento eliminado");
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;
      
      case 4:
        println("eliminando ultimo... ");
        cola.elimUltimo();
        println("elemento eliminado");
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;

      case 5:
        cola.mostrar();
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;

      case 6:
        println("eliminando todos los elementos... ");
        cola.borrar();
        println("cola vaciada");
        println("elija una opcion: ");
        switchCase(read.nextInt());
        break;

      case 7:
        System.out.println("bye bye uwu");
        break;

      default:
        break;
      
    }
  }

  static void println(String s) {
    System.out.println(s);
  }
}
