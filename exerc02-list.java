import java.util.Scanner;
public class Valor {
  public static void main(String[] args) {
    Scanner valor = new Scanner (System.in);

    int valor_1, valor_2;

    System.out.print("Digite o primeiro valor: ");
    valor_1 = valor.nextInt();

    System.out.print("Digite o segundo valor: ");
    valor_2 = valor.nextInt();

    if (valor_1 == valor_2) {
      System.out.print("Os numeros sao iguais: ");
    } else {
      System.out.print("Os numeros sao diferentes: ");
    }

    if (valor_1 > valor_2 && valor_1 < valor_2) {
      // valor_2 = valor_1;
      System.out.println("Valor maior: " + valor_1);
    }
    else {
      // valor_2 = valor_1;
      System.out.println("Valor menor: " + valor_2);
    }

    System.out.println(" valor maior: " +valor_1+ " valor menor: " + valor_2);
    valor.close();

  }
}
