package tercer_semestre.clases_repaso;
import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    int row = 3, column = 2;
    int[][] arreglo = new int[row][column];
    Scanner read = new Scanner(System.in);
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println("ingrese un numero: ");
        arreglo[i][j] = read.nextInt();
      }
    }
    System.out.println("esta es tu lista:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(arreglo[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    int rowSum = 0, columnSum = 0;
    for (int i = 0; i < row; i++) {
      rowSum += arreglo[i][0];
      columnSum += arreglo[i][1];
      System.out.print(rowSum + "\t");
      System.out.println(columnSum);
    } 
    System.out.println();
    System.out.println("suma de filas: " + rowSum);
    System.out.println("suma de columnas: " + columnSum);
  }
}
