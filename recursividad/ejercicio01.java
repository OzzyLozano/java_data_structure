package recursividad;

public class ejercicio01 {
  public static void main(String[] args) {
    ejercicio01 ex = new ejercicio01();
    int x = 5;
    ex.print(x);
  }

  void print(int x) {
    if (x > 0){
      System.out.println(x);
      print(x - 1);
    }
  }
}
