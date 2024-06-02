import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em dólares: ");
        double valorEmDolar = scanner.nextDouble();

        System.out.println("Digite a cotação: ");
        double cotacaoDolar = scanner.nextDouble();

        double valorEmReal= valorEmDolar * cotacaoDolar;
        
        System.out.printf("O valor em reais é de R$ %.2f%n", valorEmReal);
        scanner.close();

    }
}
