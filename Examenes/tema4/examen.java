package Examenes.tema4;

public class examen {
  static ArbolBinario arbol = new ArbolBinario();

  public static void main(String[] args) {
    System.out.println(
      arbol.isEmpty()
    );
    arbol.add(69);
    arbol.add(13);
    arbol.add(17);
    arbol.add(81);
    arbol.add(120);
    System.out.println(
      arbol.isEmpty()
    );
    arbol.enOrden();
    arbol.buscar(69);
    arbol.buscar(17);
    arbol.buscar(1);
    System.out.println(
      arbol.altura()
    );
    arbol.add(19);
    arbol.enOrden();
    System.out.println();
    System.out.println(
      arbol.altura()
    );
  }

}
