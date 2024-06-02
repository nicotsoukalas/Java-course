// Imprimindo o maior 

// Crie um programa Java que
// solicita ao usuário uma série de números
// e quando ele digitar um número negativo,
// o programa irá encerrar e imprimir o maior número entre os digitados.
// Você deve utilizar estruturas de repetição para coletar os números e
// determinar qual é o maior.

// Ex: Suponha que o usuário insira os seguintes números:
//  5, 12, 8, 25, 3, -1
// A saída do programa deve ser: 25.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroDigitado = scanner.nextInt();
        int index = 0;

        while (numeroDigitado >= 0) {
            numeroDigitado = scanner.nextInt();
            if (numeroDigitado > index) {
                index = numeroDigitado;
            }
        }
        System.out.println(index);
        scanner.close();
        
    }
}
