package arboles.arbol2;

import java.util.Scanner;

public class MainClass {
  static Scanner read = new Scanner(System.in);
  static ArbolBinario arbol = new ArbolBinario();
  
  public static void main(String[] args) {
    printMenu();
  }

  static void switch_function() {
    boolean bool = true;
    do {
      System.out.println("ingrese una opcion");
      switch (read.nextInt()) {
        case 1 -> {
          System.out.print("ingrese un numero: ");
          arbol.add(read.nextInt());
          System.out.println("elemento anadido ");
        }
        case 2 -> {
          System.out.print("ingrese numero a eliminar: ");
          arbol.remove(read.nextInt());
        }
        case 3 -> System.out.println("altura del arbol: " + arbol.alturaArbol());
        case 4 -> System.out.println("altura lado izq: " + arbol.alturaLadoI());
        case 5 -> System.out.println("altura lado der: " + arbol.alturaLadoD());
        case 6 -> System.out.println("numero menor: " + arbol.buscarMenor());
        case 7 -> System.out.println("numero mayor: " + arbol.buscarMayor());
        case 8 -> System.out.println(arbol.isEmpty());
        case 9 -> {
          arbol.preOrden();
          System.out.println("");
        }
        case 10 -> {
          arbol.enOrden();
          System.out.println("");
        }
        case 11 -> {
          arbol.postOrden();
          System.out.println("");
        }
        case 12 -> System.out.println(arbol.isBalanced());
        case 13 -> System.out.println("balance: " + arbol.balance());
        case 14 -> {
          System.out.print("ingrese elemento a buscar: ");
          arbol.buscar(read.nextInt());
        }
        case 15 -> {
          int x, m;
          System.out.print("ingrese cantidad de valores a anadir: ");
          x = read.nextInt();
          System.out.println("ingrese un limite para el rango: ");
          m = read.nextInt();
          randomNumbers(x, m);
        }
      }
    } while (bool);
  }

  static void printMenu() {
    System.out.println("\noperaciones con arboles binarios \n");
    System.out.println("1. insertar");
    System.out.println("2. eliminar");
    System.out.println("3. obtener altura del arbol");
    System.out.println("4. obtener altura del lado izq");
    System.out.println("5. obtener altura del lado der");
    System.out.println("6. obtener el numero menor");
    System.out.println("7. obtener el numero mayor");
    System.out.println("8. checar si esta vacia");
    System.out.println("9. imprimir preorden");
    System.out.println("10. imprimir en orden");
    System.out.println("11. imprimir postorden");
    System.out.println("12. checar si esta balanceada");
    System.out.println("13. obtener balance");
    System.out.println("14. buscar elemento");
    System.out.println("15. insertar valores aleatorios");
    switch_function();
  }

  static void randomNumbers(int x, int m) {
    for (int i = 0; i < x; i++) {
      arbol.add((int)(Math.random()*(m + 1)));
    }
    System.out.println("");
  }

}
