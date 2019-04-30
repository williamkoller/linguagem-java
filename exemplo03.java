import java.util.Arrays;
public class Ordena {
	 public static void main (String args[]){
		 int a=3;
		 int b=2;
		 int c=5;
		 int d=1;
		 int e=4;
		 int[] ordenada = ordena(a,b,c,d,e);
		 System.out.println("Lista ordenada :");
		 for (int i = 0; i < ordenada.length; i++) {
			System.out.println(ordenada[i]);
		}
	 }
	 private static int[] ordena(int a, int b , int c, int d, int e){
		 int vetor[] = new int [5];
		 vetor[0]=a;
		 vetor[1]=b;
		 vetor[2]=c;
		 vetor[3]=d;
		 vetor[4]=e;
		 Arrays.sort(vetor);
		 return vetor;
	 }
}
