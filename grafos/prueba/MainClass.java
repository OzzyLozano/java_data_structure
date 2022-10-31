package grafos.prueba;

import java.util.Scanner;

public class MainClass {
  static Scanner read = new Scanner(System.in);
  static Grafo grafo = new Grafo();

  public static void main(String[] args) {
    grafo.add(4);
    grafo.add(9);
    grafo.add(6);
    grafo.addArista(4, 9);
    grafo.addArista(6, 9);
    System.out.println(
      grafo.comprobarArista(4, 9)
    );
    System.out.println(
      grafo.comprobarArista(6, 9)
    );
    grafo.mostrarAristas();
    grafo.show();
    grafo.matrizA();
    System.out.println(
      
    );
  }

}
