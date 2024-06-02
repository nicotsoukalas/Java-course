import java.util.Scanner;
/*
 * Escreva um programa que checa se um ano é bissexto. 
 * Um ano bissexto é um ano divisível por 4, com exceção dos
 * anos divisíveis por 100 mas não divisíveis por 400.
 * 
 * Ex: O ano 2000 foi um ano bissexto porque é divisível por 400,
 * mas o ano 1900 não foi porque é divisível por 100 e não por 400.
 */
public class AnoBissexto {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um ano: ");

    int ano = scanner.nextInt();
    // if (ano % 4 !=0 || (ano % 100 == 0 && ano % 400 !=0))
    if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
      System.out.println("O ano é bissexto.");
    } else 
    System.out.println("O ano não é bissexto");

    scanner.close();
  }
}
