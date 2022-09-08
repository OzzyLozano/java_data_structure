package recursividad;

public class ejercicio05 {
  static int num1 = 0, num2 = 1, num3, i = 1;
  public static void main(String[] args) {
    ejercicio05 ej5 = new ejercicio05();
    ej5.fibonacci();
  }

  void fibonacci() {
    if (i == 1) {
      System.out.println(i + "." + num1);
      i++;
      fibonacci();
    }
    else if (i == 2) {
      System.out.println(i + "." + num2);
      i++;
      fibonacci();
    }
    else{
      if (num3 > 1000) System.out.println("fin c:");
      else {
        num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
        System.out.println(i + "." + num3);
        i++;
        fibonacci();
      }
    }
  }
}
