package grafos;

import java.util.Scanner;

public class MainClass {
  static Scanner read = new Scanner(System.in);
  static Grafo grafo = new Grafo();

  public static void main(String[] args) {
    grafo.buscar(0);
    grafo.add(4);
    grafo.add(9);
    grafo.buscar(5);
    grafo.add(6);
    grafo.buscar(6);
    grafo.show();
    grafo.cantidad();
    grafo.addArista(4, 9);
    grafo.addArista(4, 6);
    grafo.mostrarAristas();
    // grafo.comprobarVinculo(4, 9);
    // grafo.dirigir(4, 9);
    // grafo.comprobarVinculo(4, 9);
    // grafo.imprimirTablaVinculos();
    grafo.show();
  }

}
