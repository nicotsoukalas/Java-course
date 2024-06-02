// Imprimir Array de Números

// Crie um programa que lê um número inteiro n
// que representa a quantidade de números a serem inseridos pelo usuário e,
// em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.

// Obs: Cada número deve ser impresso numa linha separada.
// Além disso a impressão deve ser feita depois da leitura de todos os números,
// e não durante.

import java.util.Scanner;

public class ImprimirArrayNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int index1 = 0;
        int index2 = 0;
        int[] lista = new int[numero];
        while (index1 < numero) {
            int numeroDigitado = scanner.nextInt();
            lista[index1] = numeroDigitado;
            index1 ++;
        }
        while (index2 < numero) {
            System.out.println(lista[index2]);
            index2 ++;
        }

        scanner.close();
    }
}
