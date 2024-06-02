/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.00) {
            System.out.printf("A média do aluno é: %f. Ele foi Aprovado!%n", media);            
        } else {
            System.out.printf("A média do aluno é: %.3f. Ele foi Reprovado!%n", media);
        }

        scanner.close();
    }

}
