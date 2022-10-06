package mi_nodo;

public class ListaEnlazada {

  Nodo list;

  boolean isEmpty() {
    return (list == null);
  }
  
  void addProcessor(String s) {
    if (isEmpty()) {
      Nodo newList = new Nodo();
      newList.processor = s;
      newList.link = new ListaEnlazada();
      list = newList;
    }
    else list.link.addProcessor(s);
  }
  
  void addRam(int s) {
    if (isEmpty()) {
      Nodo newList = new Nodo();
      newList.ram = s;
      newList.link = new ListaEnlazada();
      list = newList;
    }
    else list.link.addRam(s);
  }
  
  void addStorage(int s) {
    if (isEmpty()) {
      Nodo newList = new Nodo();
      newList.ram = s;
      newList.link = new ListaEnlazada();
      list = newList;
    }
    else list.link.addStorage(s);
  }

}
