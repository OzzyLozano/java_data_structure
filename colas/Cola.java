package colas;
/*
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
*/


public class Cola {
  // List<Integer> list = new ArrayList<>();
  int v[] = new int[50];
  int indiceCola;

  Cola() {
    indiceCola = -1;
  }

  void agregar(int n) {
    if(indiceCola < 49) {
      indiceCola++;
      v[indiceCola] = n;
    } else System.out.println("su cola esta llena");
  }

  void eliminar() {
    for (int i = 0; i < indiceCola; i++) {
      v[i] = v[i + 1];
    }
    indiceCola--;
  }

  void mostrarCola() {
    println("esta es su cola");
    for (int i = 0; i <= indiceCola; i++) {
      println("" + v[i]);
    }
  }

  void eliminarElementos() {
    indiceCola = -1;
  }

  void mostrarPrimerElemento() {
    if(indiceCola != -1) println("El primer elemento es: " + v[0]);
    else println("cola vacia");
  }

  void buscarElemento(int n) {
    boolean bool = false;
    for (int i = 0; i <= indiceCola; i++) {
      if(v[i] == n) bool = true;
    }
    if(bool) println("elemento encontrado");
    else println("elemento no encontrado");
  }

  void isEmpty() {
    if(indiceCola == -1) println("cola vacia");
    else println("cola contiene elementos");
  }

  void size() {
    println("size: " + (indiceCola + 1));
  }

  void salir() {
    println("bye byeee uwu");
  }

  private void println(String s) {
    System.out.println(s);
  }

}
