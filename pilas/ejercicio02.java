package pilas;

import java.util.Stack;

public class ejercicio02 {
  public static void main(String[] args) {
    Stack pila = new Stack<>();
    pila.push(1);
    pila.push(2);
    pila.push(3);
    pila.pop();

    System.out.println(pila.firstElement());
    System.out.println(pila);
    if (pila.empty()) System.out.println("pila vacia");
    else System.out.println("pila no vacia");
    System.out.println(pila.search(1));
    System.out.println(pila.size());
  }
}
