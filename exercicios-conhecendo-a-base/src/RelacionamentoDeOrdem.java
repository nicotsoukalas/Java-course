import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {

        System.out.println("Digite dois números: ");

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        System.out.println(numero1 + " = " + numero2 + " ? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));

        scanner.close();
    }
}
