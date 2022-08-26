package tercer_semestre.clases_repaso;

import java.util.Scanner;

public class ejercicio10 {
  static Scanner read = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("cuantos estudiantes son?");
    int n_estudiantes = read.nextInt();
    double[] calificaciones = new double[n_estudiantes];
    double promedio = 0;
    for (int i = 0; i < calificaciones.length; i++) {
      System.out.println("ingrese calificacion estudiante " + (i + 1));
      calificaciones[i] = read.nextDouble();
      promedio += calificaciones[i];
    }
    int est = 0;
    promedio /= calificaciones.length;
    for (int i = 0; i < calificaciones.length; i++) {
      if(calificaciones[i] > promedio) est++;
    }
    System.out.println("el promedio es: " + promedio);
    System.out.println("hay " + est + " estudiantes encima del promedio");
  }
}
