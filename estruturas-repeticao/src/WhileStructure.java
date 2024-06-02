import java.util.Scanner;

public class WhileStructure {
    public static void main(String[] args) {
        int numero = 7, tentativas = 5;


        Scanner scanner = new Scanner(System.in);
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 10: ");
            int numeroFornecido = scanner.nextInt();

            if (numeroFornecido == numero) {
                System.out.println("Você acertou!");
                return;
            } else {
                tentativas --;
            }
        }
        scanner.close();
    }
}
