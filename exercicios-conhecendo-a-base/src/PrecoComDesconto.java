import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite o desconto: ");
        double desconto = scanner.nextDouble() ;
      
        double precoComDesconto = preco * (desconto / 100);
        double novoPreco = preco - precoComDesconto;
        
        System.out.printf("O preço com desconto é R$ %.2f e o valor economizado foi R$%.2f%n", novoPreco, precoComDesconto);
        
        scanner.close();
    }
}
