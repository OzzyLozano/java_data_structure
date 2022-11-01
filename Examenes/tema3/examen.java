package Examenes.tema3;

import java.util.LinkedList;
import java.util.Scanner;

public class examen {
  static Scanner read = new Scanner(System.in);
  static LinkedList lista = new LinkedList<>();
  static boolean bool = true;
  public static void main(String[] args) {
    printMenu();
    switchCase();
  }

  private static void switchCase() {
    do {
      System.out.print("elija una opcion: ");
      switch (read.nextInt()) {
        case 1:
          System.out.println("ingrese el numero");
          lista.addFirst(read.nextInt());
          System.out.println("numero aniadido");
          break;
        case 2:
          System.out.println("ingrese el numero");
          lista.addLast(read.nextInt());
          System.out.println("numero aniadido");
          break;
        case 3:
          System.out.print("eliminando primer elemento...");
          lista.removeFirst();
          System.out.println(" elemento eliminado");
          break;
        case 4:
          System.out.print("eliminando ultimo elemento...");
          lista.removeLast();
          System.out.println(" elemento eliminado");
          break;
        case 5:
        System.out.println("esta es su lista:");
          System.out.println(lista);
          break;
        case 6:
          System.out.print("ingrese el elemento a buscar: ");
          if (lista.contains(read.nextInt())) System.out.println("elemento encontrado");
          else System.out.println("elemento no existe en la lista");
          break;
        case 7:
          System.out.print("se eliminaran todos los elementos... ");
          lista.clear();
          System.out.println("elementos eliminados");
          break;
        case 8:
          System.out.println("bye bye uwu");
          bool = false;
          break;
      
        default:
          System.out.println("numero no valido unu");
          break;
      }
    } while (bool);
  }

  private static void printMenu() {
    System.out.println("operaciones con lista.");
    System.out.println("1. insertar elementos al inicio");
    System.out.println("2. insertar elementos al final");
    System.out.println("3. eliminar el primer elemento");
    System.out.println("4. eliminar el ultimo elemento");
    System.out.println("5. mostrar la lista");
    System.out.println("6. buscar un elemento en la lista");
    System.out.println("7. borrar toda la lista");
    System.out.println("8. salir");
  }
}
