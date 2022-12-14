package pilas;

import java.util.Scanner;
import java.util.Stack;

public class ejercicio03 {
  static Scanner read = new Scanner(System.in);
  static Stack pila = new Stack<>();
  static boolean bool = true;
  public static void main(String[] args) {
    println("operaciones con pilas");
    println("1. insertar dato");
    println("2. eliminar elemento");
    println("3. mostrar elemento cima");
    println("4. mostrar todos los elementos");
    println("5. buscar elemento");
    println("6. verificar si esta vacia");
    println("7. obtener size");
    println("8. salir");
    do {
      println("elija una opcion (por el numero de operacion)");
      switchCase(read.nextInt());
    } while (bool);
  }

  private static void switchCase(int op) {
    switch (op) {
      case 1:
        print("ingrese un dato: ");
        pila.push(read.nextInt());
        break;
      case 2:
        print("eliminando ultimo elemento... ");
        pila.pop();
        println("listo c:");
        break;
      case 3:
        println("elemento cima: " + pila.firstElement());
        break;
      case 4:
        println("pila: " + pila);
        break;
      case 5:
        print("ingrese elemento a buscar: ");
        println("" + pila.search(read.nextInt()));
        break;
      case 6:
        if (pila.empty()) println("pila vacia");
        else println("pila no vacia");
        break;
      case 7:
        println("size: " + pila.size());
        break;
      case 8:
        bool = false;
        println("bye bye c:");
        break;
    
      default:
        print("\nelija una opcion correcta: ");
        switchCase(read.nextInt());
        println("");
        break;
    }
  }

  private static void print(String s) {
    System.out.print(s);
  }

  private static void println(String s) {
    System.out.println(s);
  }
}
