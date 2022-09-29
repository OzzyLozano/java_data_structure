package colas;

import java.util.LinkedList;

public class ejercicio03 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList<>();
    list.add("uno");
    list.add(2);
    list.add("tres");
    list.add(4);

    System.out.println("Los elementos de la lista son: \n" + list);

    list.addFirst("inicio");
    list.addLast("final");

    System.out.println("Los elementos de la lista son: \n" + list);
  }
}
