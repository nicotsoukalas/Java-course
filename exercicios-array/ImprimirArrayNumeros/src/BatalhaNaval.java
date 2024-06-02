// Batalha Naval
// Implementar um batalha naval, onde dado um mapa o usuário tenta adivinhar
//  onde estão os navios. Considere um tabuleiro de tamanho 5 x 5 e 10 tentativas
//   para acertar a posição de 3 navios que estão no mapa (navio ocupa apenas uma posição). 

// O jogo deve solicitar primeiro a posição dos 3 navios,
//  e então preencher o mapa com água (~) e com os navios (N). 
//  Após isso, devem ser lidas a linha e a coluna que o usuário acha que o navio está.
//   Caso ele consiga acertar antes das tentativas esgotarem, 
//   ele verá uma mensagem de vitória:

// Digite as posições dos navios: 
// Navio 1: 
// 0 0
// Navio 2: 
// 1 1
// Navio 3: 
// 2 2
// Bem-vindo ao jogo de Batalha Naval!
// Você tem 10 tentativas para afundar 3 navios.

//   0 1 2 3 4
// 0 N ~ ~ ~ ~ 
// 1 ~ N ~ ~ ~ 
// 2 ~ ~ N ~ ~ 
// 3 ~ ~ ~ ~ ~ 
// 4 ~ ~ ~ ~ ~ 
// Tentativas restantes: 10
// Digite a linha e a coluna (0-4): 0 0
// Você acertou um navio!

//   0 1 2 3 4
// 0 X ~ ~ ~ ~ 
// 1 ~ N ~ ~ ~ 
// 2 ~ ~ N ~ ~ 
// 3 ~ ~ ~ ~ ~ 
// 4 ~ ~ ~ ~ ~ 
// Tentativas restantes: 9
// Digite a linha e a coluna (0-4): 1 1
// Você acertou um navio!

//   0 1 2 3 4
// 0 X ~ ~ ~ ~ 
// 1 ~ X ~ ~ ~ 
// 2 ~ ~ N ~ ~ 
// 3 ~ ~ ~ ~ ~ 
// 4 ~ ~ ~ ~ ~ 
// Tentativas restantes: 8
// Digite a linha e a coluna (0-4): 2 2
// Você acertou um navio!
// Parabéns! Você afundou todos os navios.

import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNavios = 3;
        int tamanho = 5;
        int tentativas = 0;
        String[][] posicao = new String[5][5];

        // Preenche a matriz com ~
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                posicao[i][j] = "~";
            }
        }

        // Pede para inserir 3 posições dos navios
        System.out.println("Digite as posições dos navios: ");

        for (int i = 0; i < quantidadeNavios; i++) {
            System.out.println("Navio " + i + ":");
            int posicaoyNavio = scanner.nextInt();
            int posicaoxNavio = scanner.nextInt();
            posicao[posicaoyNavio][posicaoxNavio] = "N";
        }

        // Mensagem inicial
        System.out.println("Bem-vindo ao jogo de Batalha Naval!");
        System.out.println("Você tem 10 tentativas para afundar 3 navios.");

        while (tentativas <= 10) {
            // Preenche a primeira fileira
            System.out.print("  ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Preenche o restante da matriz
            for (int i = 0; i < tamanho; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < tamanho; j++) {
                    System.out.print(posicao[i][j] + " ");
                }
                System.out.println();
            }

            // Tentativas
            System.out.println("Tentativas restantes: " + (10 - tentativas));
            System.out.println("Digite a linha e a coluna (0-4):");
            int posicaoyNavio = scanner.nextInt();
            int posicaoxNavio = scanner.nextInt();
            if (posicao[posicaoyNavio][posicaoxNavio] == "N") {
                System.out.println("Você acertou um navio!");
                posicao[posicaoyNavio][posicaoxNavio] = "X";
                quantidadeNavios --;
                tentativas++;
                if (quantidadeNavios == 0) {
                    System.out.println("Parabéns! Você afundou todos os navios.");
                    return;
                }
            } else if (tentativas == 0) {
                System.out.println("Você perdeu. Os navios sobreviveram.");
                return;
            } else {
                tentativas++;
            }
            scanner.close();
        }
    }
}
