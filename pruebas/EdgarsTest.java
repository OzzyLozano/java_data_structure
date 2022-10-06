package pruebas;

import java.util.Scanner;

public class EdgarsTest {
  // i here declare my variables, the arrays are so that i can check easily wich
  // month numbers have 31 or 30, their for to be iterated
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
    read.close(); // closing my scanner variable, for i wont use it anymore, and consumes memory
    verificar(dia, mes); // here we pass day and month to check if theyre to be a real date
    System.out.println("tu fecha es: " + dia + "/" + mes + "/" + year);
  }

  // after going to the check function it should return true or false, and this function
  // has the conditions as to what to do in wich case of month
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

  // the check function here cheks if the arrays we declared at the start of our class
  // contains the month the user entered, i used this so we have a cleaner code
  static boolean check(int mes, int dias[]) {
    for (int i : dias) if (i == mes) return true;
    return false;
  } // once we know that our month is or isnt in the selected, 
  // the 'verificar' function will take care of the rest
}
