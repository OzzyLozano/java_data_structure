package pruebas;

import java.util.Scanner;

public class pruebaEstupidaEdgar {
  static int dias31[] = {1, 3, 5, 7, 8, 10, 12}, dias30[] = {4, 6, 9, 11};
  static int dia, mes, year;

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.print("ingrese dia: ");
    dia = read.nextInt();
    System.out.print("ingrese mes: ");
    mes = read.nextInt();
    System.out.print("ingrese year: ");
    year = read.nextInt();
    read.close();
    verificar(dia, mes);
    System.out.println("tu fecha es: " + dia + "/" + mes + "/" + year);
  }

  static void verificar(int dia, int mes) {
    if(check(mes, dias31)) {
      if (!(dia < 32) || !(dia > 0)) noTiene(mes, dia);
    }
    else if(check(mes, dias30)) {
      if (!(dia < 31) || !(dia > 0)) noTiene(mes, dia);
    }
    else if (mes == 2) {
      if (!(dia < 29) || !(dia > 0)) noTiene(mes, dia);
    }
    else System.out.println("mes " + mes + " no existe unu");
  }

  static void noTiene(int mes, int dia) {
    System.out.println("el mes " + mes + " no tiene " + dia + " dias");
  }

  static boolean check(int mes, int dias[]) {
    for (int i : dias) if (i == mes) return true;
    return false;
  }
}
