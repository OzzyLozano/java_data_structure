package pilas;

public class Pila {
  int v[] = new int[50];
  int indicePila;

  Pila() {
    indicePila = -1;
  }

  void agregar(int n) {
    if (indicePila < 49){
      indicePila++;
      v[indicePila] = n;
    } 
    else System.out.println("Pila desbordada");
  }

  void eliminar() {
    if(indicePila > -1) {
      System.out.println(v[indicePila]);
      indicePila--;
    }
    else System.out.println("No hay elementos a eliminar");
  }

  int mostrarCima() {
    if(indicePila != -1) return v[indicePila];
    else {
      System.out.println("no hay elementos");
      return 0;
    }
  }

  void mostrarElementos() {
    for (int i = 0; i <= indicePila; i++) {
      System.out.println(v[i]);
    }
  }

  int buscarElemento(int n) {
    for (int i = 0; i < v.length; i++) {
      if(n == v[i]) return v[i];
    }
    return -1;
  }

  boolean isEmpty() {
    if(indicePila == -1) return true;
    else return false;
  }

  int size() {
    return indicePila + 1;
  }

}
