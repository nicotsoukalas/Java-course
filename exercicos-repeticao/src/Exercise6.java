// Sequência de Fibonacci

// A Sequência de Fibonacci é uma série matemática
// em que cada número subsequente é a soma dos dois números anteriores.
// Começando com 0 e 1, os primeiros termos da sequência são
// 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante.
// Por exemplo, dado o número 7, o termo fibonacci é 13.

// Você deve criar um programa Java que permita ao usuário
// informar um número e calcule o termo da Sequência de Fibonacci
// correspondente a esse número inteiro positivo.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInformado = scanner.nextInt();
       
        int primeiroValor = 0;
        int segundoValor = 1;
        int sequenciaFibbonacci = 0;
        if (numeroInformado == 1) { 
            sequenciaFibbonacci = 1;
        }
        for (int i = 1; i < numeroInformado; i++) {
            
            sequenciaFibbonacci = primeiroValor + segundoValor;
            primeiroValor = segundoValor;
            segundoValor = sequenciaFibbonacci;
        }
        System.out.println(sequenciaFibbonacci);
        scanner.close();
    }
}
