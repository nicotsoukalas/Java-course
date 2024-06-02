import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade mínima: ");
        int quatidadeMinima = scanner.nextInt();

        System.out.println("Informe a quantidade máxima: ");
        int quantidadeMaxima = scanner.nextInt();

        double estoqueMedio = (quatidadeMinima + quantidadeMaxima) / 2.0;

        System.out.printf("O estoque médio é de %f unidades.%n", estoqueMedio);

        scanner.close();
    }
}
