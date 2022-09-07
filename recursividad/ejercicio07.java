package recursividad;

public class ejercicio07 {
  double inverso;
  public static void main(String[] args) {
    ejercicio07 ex = new ejercicio07();
    double n = 3;
    ex.num_inverso(n);
  }

  void num_inverso(double n) {
    inverso = 1/n;
    System.out.println(inverso);
  }
}
