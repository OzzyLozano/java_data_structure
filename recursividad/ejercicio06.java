package recursividad;

public class ejercicio06 {
  int x = 3, ans = x;
  public static void main(String[] args) {
    ejercicio06 ex = new ejercicio06();
    int n = 7;
    ex.function(n);
  }
  void function(int n) {
    if(n > 1) {
      ans *= x;
      n--;
      function(n);
    } else {
      System.out.println(ans);
    }
  }

}
