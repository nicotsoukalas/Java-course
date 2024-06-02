import java.util.Scanner;

public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a figura (retangulo, triangulo, circulo): ");
        String figuraGeometrica = scanner.next();

        switch (figuraGeometrica) {
            case "retangulo" -> {
                System.out.println("Digite a base e a altura:");
                int base = scanner.nextInt();
                int altura = scanner.nextInt();
                
                int area = base * altura;
                System.out.println(area);
            }
            case "triangulo" -> {
                System.out.println("Digite a base e a altura:");
                int base = scanner.nextInt();
                int altura = scanner.nextInt(); 

                double area = (base * altura) / 2.0;
                System.out.println(area);
            }
            case "circulo" -> {
                System.out.println("Digite o raio:");
                int raio = scanner.nextInt();
                double area = 3.14 * (raio * raio); 
                System.out.println(area);
            }
            default -> System.out.println("Figura não suportada!");
            
        }


        scanner.close();
    }
}
