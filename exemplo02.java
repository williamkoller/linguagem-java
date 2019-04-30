import java.util.Scanner;
public class ExemploDois {
  public static void main(String args[])
  {
    Scanner ler = new Scanner (System.in);
    // System.in objeto padrão entrada de dados, representa o teclado
    String nome;
    int idade;

    // Ler é um objeto instanciado a partir da classe Scanner
    // Ele vai ter tudo que a classe Scanner tiver

    System.out.print("Digite o seu nome: ");
    nome = ler.next();

    System.out.print("Digite sua idade: ");
    idade = ler.nextInt();

    System.out.println(nome + " a sua idade  eh: " + idade );
    ler.close(); // fecha aentrada de dados
  }
}
