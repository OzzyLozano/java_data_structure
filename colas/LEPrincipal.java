package colas;

import java.util.Scanner;

public class LEPrincipal {
  static Scanner read = new Scanner(System.in);
  static ListaEnlazada lista = new ListaEnlazada();
  public static void main(String[] args) {
    printMenu();
  }

  static void printMenu() {
    System.out.println("operaciones con listas");
    System.out.println("1. agregar elemento");
    System.out.println("2. borrar todo");
    System.out.println("3. mostrar lista");
    System.out.println("4. checar si ta vacia");
    System.out.println("5. reimprimir menu");
    System.out.println("6. salir c:");
    switchCase();
  }

  static void switchCase() {
    System.out.println("elija una opcion");
    switch (read.nextInt()) {
      case 1:
        System.out.println("ingrese un dato");
        lista.insertar(read.nextInt());
        switchCase();
        break;
      
      case 2:
        System.out.print("eliminando datos... ");
        lista.borrarDatos();
        System.out.println("datos eliminados uwu");
        switchCase();
        break;
      
      case 3:
        System.out.println("esta es tu lista: ");
        lista.mostrarDatos();
        switchCase();
        break;
      
      case 4:
        System.out.println(lista.isEmpty());
        switchCase();
        break;
      
      case 5:
        printMenu();
        break;
      
      case 6:
        System.out.println("bye bye uwu");
        break;
      
      
      default:
        System.out.println("opcion invalida unu");
        switchCase();
        break;
    }
  }

}
