package arboles;

import java.util.Scanner;

public class ArbolPrincipal {
  static Scanner read = new Scanner(System.in);
  static ArbolBinario arbol = new ArbolBinario();

  public static void main(String[] args) {
    printMenu();
    do_while_function();
  }

  static void do_while_function() {
    boolean bool = true;
    do {
      System.out.print("elija una opcion: ");
      switch (read.nextInt()) {
        case 1 -> {
          System.out.print("ingrese un elemento: ");
          arbol.add(read.nextInt());
        }
        case 2 -> {
          System.out.print("ingrese elemento a eliminar: ");
        }
        case 3 -> arbol.preOrden();
        case 4 -> arbol.enOrden();
        case 5 -> arbol.postOrden();
        case 6 -> {
          System.out.print("elemento a buscar: ");
          arbol.buscarNum(read.nextInt());
        }
        case 7 -> System.out.println("la cantidad de elementos es: " + arbol.cantidad());
        case 8 -> System.out.println("la altura es de: " + arbol.altura());
        case 9 -> System.out.println("el arbol tiene nivel de " + arbol.nivel());
        case 10 -> System.out.println("el numero menor es " + arbol.buscarMenor());
        case 11 -> System.out.println("el numero mayor es " + arbol.buscarMayor());
        case 12 -> System.out.println(arbol.esHoja());
        case 13 -> {
          System.out.println("bye bye uwu");
          bool = false;
        }
        case 14 -> printMenu();
      
        default -> System.out.println("elija un valor entre el 1 al 14");
      }
    } while (bool);
  }

  static void printMenu() {
    System.out.println("operaciones con arboles binarios.");
    System.out.println("1. insertar elemento");
    System.out.println("2. eliminar un dato");
    System.out.println("3. recorrido en preorden");
    System.out.println("4. recorrido en orden");
    System.out.println("5. recorrido en postorden");
    System.out.println("6. buscar un elemento");
    System.out.println("7. cantidad de elementos");
    System.out.println("8. obtener altura del arbol");
    System.out.println("9. obtener nivel del arbol");
    System.out.println("10. obtener el numero menor");
    System.out.println("11. obtener el numero mayor");
    System.out.println("12. verifiacr si un elemento es hoja");
    System.out.println("13. salir");
    System.out.println("14. reimprimir el menu");
  }

}
