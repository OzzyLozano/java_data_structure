package metodos_busqueda.secuencial.lineal;

import java.util.Scanner;

public class BusquedaSecuencial {
  public static void main(String[] args) {
    int v[] = new int[5];
    Scanner read = new Scanner(System.in);
    for (int i = 0; i < v.length; i++) {
      System.out.print("ingrese un numero: ");
      v[i] = read.nextInt();
    }
    System.out.print("ingrese elemento a buscar: ");
    int a = read.nextInt();
    read.close();
    String s = "elemento no encontrado";
    for (int i = 0; i < v.length; i++) {
      if (a == v[i]) {
        s = "elemento encontrado";
        break;
      }
    }
    System.out.println(s);
  }
}
