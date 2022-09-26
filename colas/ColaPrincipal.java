package colas;

import java.util.Scanner;

public class ColaPrincipal {
  static Cola cola = new Cola();
  static Scanner read = new Scanner(System.in);
  public static void main(String[] args) {
    println("Operaciones con colas");
    println("1. ingrese un dato");
    println("2. eliminar un dato");
    println("3. mostrar todos los elementos");
    println("4. borrar todos los elementos");
    println("5. mostrar el primer elemento");
    println("6. buscar un elemento");
    println("7. verificar si esta vacia");
    println("8. cantidad de elementos");
    println("9. salir");
    switch_case();
  }

  static void switch_case() {
    println("Elija una opcion");
    switch (read.nextInt()) {
      case 1:
        println("ingrese un dato: ");
        cola.agregar(read.nextInt());
        println("elemento agregado");
        switch_case();
        break;
      case 2:
        println("eliminando primer elemento...");
        cola.eliminar();
        println("elemento eliminado");
        switch_case();
        break;
      case 3:
        cola.mostrarCola();
        switch_case();
        break;
      case 4:
        cola.eliminarElementos();
        println("se ha vaciado la cola");
        switch_case();
        break;
      case 5:
        cola.mostrarPrimerElemento();
        switch_case();
        break;
      case 6:
        cola.buscarElemento(read.nextInt());
        switch_case();
        break;
      case 7:
        cola.isEmpty();
        switch_case();
        break;
      case 8:
        cola.size();
        switch_case();
        break;
      case 9:
        println("bye bye c:");
        read.close();
        break;
    
      default:
        println("numero invalido");
        switch_case();
        break;
    }
  }

  static void println(String s) {
    System.out.println(s);
  }
}
