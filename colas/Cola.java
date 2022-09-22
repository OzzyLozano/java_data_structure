package colas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cola {
  List<Integer> list = new ArrayList<>();
  int v[] = new int[50];
  int indiceCola;

  Cola() {
    indiceCola = -1;
  }

  void agregar(int n) {
    indiceCola++;
    v[indiceCola] = n;
  }

  void eliminar() {
    
  }

  void mostrarCola() {
    for (int i = 0; i < indiceCola; i++) {
      println("" + v[i]);
    }
  }

  void eliminarElementos() {

  }

  void mostrarPrimerElemento() {
    if(indiceCola != -1) println("" + v[0]);
  }

  void buscarElemento(int n) {
    for (int i = 0; i < indiceCola; i++) {
      if(v[i] == n) println("elemento encontrado");
      else println("elemento no encontrado");
    }
  }

  void isEmpty() {
    if(indiceCola == -1) println("cola vacia");
    else println("cola contiene elementos");
  }

  int size() {
    return indiceCola + 1;
  }

  void salir() {
    println("bye byeee uwu");
  }

  private void println(String s) {
    System.out.println(s);
  }

}
