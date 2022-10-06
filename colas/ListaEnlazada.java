package colas;

public class ListaEnlazada {
  Nodo inicio;

  boolean isEmpty() {
    return (inicio == null);
  }

  void insertar(int a) {
    if (isEmpty()) {
      Nodo nuevo = new Nodo();
      nuevo.dato = a;
      nuevo.enlace = new ListaEnlazada();
      inicio = nuevo;
    }
    else inicio.enlace.insertar(a);
  }

  void mostrarDatos() {
    if (!isEmpty()) {
      System.out.println(inicio.dato + " ");
      inicio.enlace.mostrarDatos();
    }
  }

  void borrarDatos() {
    if (!isEmpty())
      inicio = null;
  }

}
