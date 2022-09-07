package recursividad;

public class ejercicio04 {
  public static void main(String[] args) {
    System.out.println(sumatoria(5));
  }

  static int sumatoria(int i) {
    if (i > 0) {
      if (i > 0) return i + sumatoria(i - 1);
      else return i;
    }
    else {
      if (i < 0) return i + sumatoria(i + 1);
      else return i;
    }
  }
}
