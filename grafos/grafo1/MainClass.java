package grafos.grafo1;

public class MainClass {
  static GrafoDirigido grafo = new GrafoDirigido();

  public static void main(String[] args) {
    System.out.println("\ngrafo dirigido \n");
    grafo.addV(6);
    grafo.addV(9);
    grafo.show();
    grafo.addA(6, 9);
    grafo.printMatrix();
  }

}
