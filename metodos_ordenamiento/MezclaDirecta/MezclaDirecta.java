package metodos_ordenamiento.MezclaDirecta;

import java.io.*;
import java.util.Random;

public class MezclaDirecta {
  static final int N= 716;
  static final int TOPE= 999;
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    File f= new File("ArchivoOrigen");
    DataOutputStream flujo= null;
    Random rand = new Random();
    try {
      //Se genera un archivo secuencialmente de claves enteras
      flujo= new DataOutputStream(new BufferedOutputStream(new
      FileOutputStream(f)));
      for (int j=1;j<=N;j++)
      flujo.writeInt(rand.nextInt(100, 999));
      flujo.close();
      mezclaDirecta(f);
    } catch (IOException e) {
      System.out.println("Error entrada/salida durante proceso" + " de ordenación ");
      e.printStackTrace();
    }
    escribir(f);
  }

  static void mezclaDirecta(File f) throws IOException {
    int longSec;
    int numReg;
    File f1= new File("ArchivoAux1");
    File f2= new File("ArchivoAux2");
    /* número de registros se obtiene dividiendo el tamaño del archivo por el tamaño del registro: 4. */
    numReg= (int)f.length()/4;
    longSec= 1;
    while (longSec < numReg) {
      distribuir(f, f1, f2, longSec, numReg);
      mezclar(f1, f2, f, longSec, numReg);
      longSec *= 2;
    }
  }

  static void distribuir(File f, File f1, File f2, int longSec, int numReg) throws IOException {
    int numSec, resto, i;
    DataInputStream flujo= new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
    DataOutputStream flujo1 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f1)));
    DataOutputStream flujo2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f2)));
    numSec= numReg/(2*longSec);
    resto= numReg%(2*longSec);
    //Distribuye secuencias de longitud longSec
    for (i=1;i<=numSec;i++) {
      subSecuencia(flujo, flujo1, longSec);
      subSecuencia(flujo, flujo2, longSec);
    }
    //Se procesa el resto de registros del archivo
    if (resto > longSec)
      resto-= longSec;
    else {
      longSec= resto;
      resto= 0;
    }
    subSecuencia(flujo, flujo1, longSec);
    subSecuencia(flujo, flujo2, resto);
    flujo.close();
    flujo1.close();
    flujo2.close();
  }
  private static void subSecuencia(DataInput f, DataOutput t, int longSec) throws IOException {
    int clave;
    //Escribe en el flujo t el dato entero leído de f
    for (int j=1;j<=longSec;j++) {
      clave= f.readInt();
      t.writeInt(clave);
    }
  }
  static void mezclar(File f1, File f2, File f, int lonSec, int numReg) throws IOException {
    int numSec, resto, i, j, k;
    int clave1= 0, clave2= 0;
    numSec= numReg/(2*lonSec); //Número de subsecuencias
    resto= numReg%(2*lonSec);
    DataOutputStream flujo= new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
    DataInputStream flujo1= new DataInputStream(new BufferedInputStream(new FileInputStream(f1)));
    DataInputStream flujo2= new DataInputStream(new BufferedInputStream(new FileInputStream(f2)));
    //Claves iniciales
    clave1= flujo1.readInt();
    clave2= flujo2.readInt();
    //Bucle para controlar todo el proceso de mezcla
    for (int s=1;s<=numSec+1;s++) {
      int n1, n2;
      n1 = n2 = lonSec;
      if (s==numSec+1) { //Proceso de subsecuencia incompleta
        if (resto > lonSec)
          n2= resto-lonSec;
        else {
          n1= resto;
          n2= 0;
        }
      }
      i = j = 1;
      while (i<=n1&&j<=n2) {
        int clave;
        if (clave1 < clave2) {
          clave= clave1;
          try {
            clave1= flujo1.readInt(); }
          catch(EOFException e) {;}
          i++;
        } else {
          clave= clave2;
          try {
            clave2 = flujo2.readInt(); }
          catch(EOFException e) {;}
          j++;
        }
        flujo.writeInt(clave);
      }
      //Los registros no procesados se escriben directamente
      for (k=i;k<=n1;k++) {
        flujo.writeInt(clave1);
        try {
          clave1= flujo1.readInt(); }
        catch(EOFException e) {;}
      }
      for (k=j;k<=n2;k++) {
        flujo.writeInt(clave2);
        try {
          clave2= flujo2.readInt(); }
        catch(EOFException e) {;}
      }
    }
    flujo.close();
    flujo1.close();
    flujo2.close();
  }
  static void escribir(File f) {
    int clave, k;
    boolean mas = true;
    DataInputStream flujo = null;
    try {
      flujo= new DataInputStream(new BufferedInputStream(new
      FileInputStream(f)));
      k= 0;
      System.out.println("ARCHIVO DE CLAVES TIPO INT");
      while (mas) {
        k++;
        System.out.print(flujo.readInt() + " ");
        if (k % 11 == 0) System.out.println();
      }
    } catch (EOFException eof) {
      System.out.println("\n *** Fin del archivo ***\n");
      try {
        flujo.close();
      } catch (IOException er) {
        er.printStackTrace();
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
