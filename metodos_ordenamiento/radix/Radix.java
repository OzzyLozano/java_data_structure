package metodos_ordenamiento.radix;

public class Radix {
  public static void main(String[] args) {
    int v[] = new int[10];
    for (int i = 0; i < v.length; i++) {
      v[i] = (int)(Math.random()*100);
      if (i != (v.length - 1)) System.out.print(v[i] + ", ");
      else System.out.print(v[i] + "\n");
    }
    radix(v);
    for (int x : v) {
      System.out.println(x);
    }
  }

  static void radix(int vector[]) {
  int a;
  int col=0, var=10;
  int matriz[][]=new int[10][20];
  int vector2[]=new int[10];
  int cant=digito(vector);
  for(int l = 0; l < 10; l++) vector2[l]=vector[l];
  for(int j = 1; j <= cant; j++){
    for(int i = 0; i < 10; i++) {
      a=vector2[i]%10;
      if(matriz[a][col]==0)
        matriz[a][col]=vector[i];
      else {
        col++;
        matriz[a][col]=vector[i];
      }
    }
    int i = 0;
    for(int f = 0; f < 10; f++) {
      for(int c = 0; c < 20; c++) {
        if(matriz[f][c]!=0) {
          vector[i]=matriz[f][c];
          i++;
        }
      }
    }
    for(int f = 0; f < 10; f++) {
      for(int c = 0; c < 20; c++) {
        matriz[f][c]=0;
      }
    }
    for(int k=0;k<10;k++) vector2[k]=vector[k]/var;
      var*=10;
    } //for (cant)
  } // función radix

  public static int digito(int vec[]){
    int c = 0;
    for (int i = 0; i < vec.length; i++) {
    String x = Integer.toString(vec[i]);
    int dig = x.length();
    if (dig > c)
    c = dig;
    }
    return c;
  } //función digito

}
