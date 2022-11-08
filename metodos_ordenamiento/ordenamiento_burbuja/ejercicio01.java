package metodos_ordenamiento.ordenamiento_burbuja;

import java.util.Scanner;

public class ejercicio01 {
  static Scanner read = new Scanner(System.in);
  static int v[] = new int[10];
  static int aux;
  public static void main(String[] args) {
    for (int i = 0; i < v.length; i++) {
      System.out.print("ingrese un elemento: ");
      v[i] = read.nextInt();
    }
      System.out.println("desea ordenarlos de menor a mayor o mayor a menor?(0/1)");
      aux = read.nextInt();
      if (aux == 0) menorMayor();
      if (aux == 1) mayorMenor();
      System.out.println("su vector: ");
    for (int num : v) {
      System.out.println(num);
    }
  }

  static void mayorMenor() {
    for (int i = 0; i < v.length; i++) {
      for (int j = 0; j < (v.length - 1); j++) {
        if (v[j] < v[j+1]) {
          aux = v[j];
          v[j] = v[j+1];
          v[j+1] = aux;
        }
      }
    }
  }

  static void menorMayor() {
    for (int i = 0; i < v.length; i++) {
      for (int j = 0; j < (v.length - 1); j++) {
        if (v[j] > v[j+1]) {
          aux = v[j];
          v[j] = v[j+1];
          v[j+1] = aux;
        }
      }
    }
  }

}
