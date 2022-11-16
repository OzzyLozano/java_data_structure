package metodos_ordenamiento.mergesort;

/*
 * el metodo de intercalacion se entregara por medio de investigacion
 * por lo tanto este estara documentado para su propia mejor comprension, 
 * en pocas palabras, se escribe aqui y copio y pego en word uwu hola maestra
 */

public class MergeSort {

  public static void main(String[] args) {
    // creo dos arrays vacios ya ordenados, ya que el metodo lo indica de esa forma
    int arrayA[] = {1, 3, 6, 9, 13, 23, 69}, arrayB[] = {2, 7, 15, 17, 21, 24};
    // creo un array que tenga como length la suma de los length del vector A y B
    int arrayC[] = new int[arrayA.length + arrayB.length];
    mergesort(arrayA, arrayB, arrayC); // llamamos la funcion
    for (int n : arrayC) { // imprimimos cada elemento con un for each
      System.out.println(n);
    }
  }

  static void mergesort(int[] arrayA, int[] arrayB, int[] arrayC) {
    int i = 0, j = 0, k = 0; // declaramos contadores, donde i -> A, j -> B, k -> C
    while (k < arrayC.length) { // recorremos hasta que nuestro contador k iguale la longitud de C
      try {
        // usamos try catch ya que si los contadores se vuelven mayores a las longitudes de sus vectores, recibimos error
        if (arrayA[i] < arrayB[j]) { // insertamos el menor en ambos
          arrayC[k] = arrayA[i]; // caso: a < b
          if (i < arrayA.length) i++;
        } else {
          arrayC[k] = arrayB[j]; // caso b < a
          if (j < arrayB.length) j++;
        }
        k++;
      } catch (Exception e) {
        // codigo para cuando da error
        while (k < arrayC.length) { // recorremos de la misma forma
          // aseguramos que si un vector termina de ser recorrido y el otro no, se dejen de comparar y se inserten los elementos solo del vector faltante
          if (hasNumbersLeft(arrayA, i)) { // caso vectorA no tiene numeros faltantes
            arrayC[k] = arrayB[j];
            j++;
          }
          if (hasNumbersLeft(arrayB, j)){ // caso vectorB no tiene numeros faltantes
            arrayC[k] = arrayA[i];
            i++;
          }
          k++;
        }
        break;
      }
    }
  }

  static boolean hasNumbersLeft(int[] array, int c) {
    if (array.length == c) return true;
    else return false;
  }

}
