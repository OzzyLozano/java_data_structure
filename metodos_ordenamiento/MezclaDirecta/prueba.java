package metodos_ordenamiento.MezclaDirecta;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class prueba {
  public static void main(String[] args) {
    Random rand = new Random();
    try {
      PrintWriter outputFile = new PrintWriter("ArchivoPrueba.txt");
      for (int i = 0; i < 716; i++) {
        outputFile.println(rand.nextInt(100, 999));
      }
      outputFile.close();
    } catch (IOException e) {
      System.out.println("error de entrada/salida durante proceso de ordenacion");
      e.printStackTrace();
    }
  }
}
