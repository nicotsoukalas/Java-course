/*
 * Exercício 1:
 * 
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 * 
 * 1. Ler 3 notas.
 * 2. Calcular média
 * 3. Imprimir resultado
 * 
 * Fórmula: MA = (n1 + n2 + n3) / 3
 */

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 3 notas: ");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double mediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média é: %.2f%n", mediaAritmetica);
        scanner.close();
    }
}
