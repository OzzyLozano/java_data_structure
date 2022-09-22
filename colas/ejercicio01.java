package colas;

import java.util.LinkedList;
import java.util.Scanner;

public class ejercicio01 {
  static Scanner read = new Scanner(System.in);
  static LinkedList cola = new LinkedList<>();
  public static void main(String[] args) {
    println("Operaciones con colas");
    println("1. ingrese un dato");
    println("2. eiminar un dato");
    println("3. mostrar todos los elementos");
    println("4. borrar todos los elementos");
    println("5. mostrar el primer elemento");
    println("6. salir");
    switch_case();
  }

  static void switch_case() {
    println("Elija una opcion");
    switch (read.nextInt()) {
      case 1:
        print("ingrese un dato: ");
        cola.offer(read.nextInt());
        switch_case();
        break;
      case 2:
        println("el elemento eliminado es " + cola.poll());
        switch_case();
        break;
      case 3:
        println("" + cola);
        switch_case();
        break;
      case 4:
        print("se eliminaran todos los elementos... ");
        cola.clear();
        println("elementos eliminados. cola vacia");
        switch_case();
        break;
      case 5:
        println("el primer elemento es: " + cola.peek());
        switch_case();
        break;
      case 6:
        println("bye bye c:");
        break;
    
      default:
        println("numero invalido");
        switch_case();
        break;
    }
  }

  static void print(String s) {
    System.out.print(s);
  }

  static void println(String x) {
    System.out.println(x);
  }

}
