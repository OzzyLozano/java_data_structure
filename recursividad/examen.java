package recursividad;

public class examen {
  public static void main(String[] args) {
    elevar(1);
  }

  static void elevar(int x) {
    if(x <= 10) {
      System.out.println(x * x);
      elevar(x + 1);
    }
  }
}
