package recursividad;

public class ejercicio03 {
  static int num = 0;
  public static void main(String[] args) {
    calc_factorial(5);
    System.out.println("factorial de 5: " + num);
  }

  static void calc_factorial(int i) {
    if (num == 0) num = i;
    i--;
    if(i > 1) {
      num *= i;
      calc_factorial(i);
    }
  }
}
