/*
* Pirâmide de números
* Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera um padrão de números crescentes da seguinte forma:
*
* 1
* 12
* 123
* 1234
* 12345
* Dica: Utilize loops aninhados para resolver o problema.
 */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();
        String acumulador = "";
        for (int i = 1; i <= numeroDigitado; i++) {
            acumulador = acumulador + i;
            System.out.println(acumulador);
        }
        scanner.close();
    }
}
