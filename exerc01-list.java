import java.util.Scanner;
public class Mercadoria {
  public static void main(String[] args) {
    Scanner mercadoria = new Scanner (System.in);

    int valor_1 , valor_2;

    float result;

    System.out.print("Digite o primeiro valor: ");
    valor_1 = mercadoria.nextInt();

    System.out.print("Digite o outro valor: ");
    valor_2 = mercadoria.nextInt();

    result = valor_1 + valor_2;

    System.out.println("O resultado eh: " + result + "O valor do desconto eh: " + result  / 100 * 25);
    mercadoria.close();

  }
}
