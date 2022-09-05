package recursividad;

public class ejemplo01 {
  public static void main(String[] args) {
    ejemplo01 ex = new ejemplo01();
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
