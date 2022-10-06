package mi_nodo;

public class Nodo {

  ListaEnlazada link;
  String processor;
  int storage;
  int ram;

  Nodo() {
    this.link = null;
    this.processor = null;
    this.storage = 0;
    this.ram = 0;
  }

}
