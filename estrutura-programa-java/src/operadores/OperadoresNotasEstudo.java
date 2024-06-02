package operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        // System.out.println(soma);
        // System.out.println("A soma é: " + soma);

        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        // System.out.println(subtracao);
        // System.out.println("A subtração é: " + subtracao);

        double numero5 = 5.3;
        double numero6 = 6.7;
        double multiplicacao = numero5 * numero6;
        // System.out.println(multiplicacao);

        int numero7 = 7;
        int numero72 = 72;
        int divisao = numero72 / numero7;
        // System.out.println(divisao);

        int modulo = numero72 % numero7;
        // System.out.println(modulo);

        int contador = 0;
        contador = contador + 1;
        contador ++;
        // System.out.println(contador);
        contador --;
        contador --;
        // System.out.println(contador);

        double decimal1 = 1.0;
        double decimal2 = 2.0;
        // System.out.println(decimal2 > decimal1);
        boolean ehMaior = decimal1 > decimal2;
        // System.out.println(ehMaior);
        // System.out.println(decimal1 >= decimal1);
        // System.out.println(decimal1 <= decimal1);

        // System.out.println(decimal1 == decimal1);
        // System.out.println(decimal1 != decimal1);


        int variavel = 1;
        variavel += 4;
        // System.out.println(variavel);
        variavel -= 1;
        // System.out.println(variavel);
        variavel *= 5;
        // System.out.println(variavel);
        variavel /= -1;
        // System.out.println(variavel);
        variavel %= 1;
        // System.out.println(variavel);

        int valor1 = 4;
        int valor2 = 2;
        boolean expressao1 = valor1 < 10 && valor2 < 10;
        // System.out.println(expressao1);
        boolean expressao2 = valor1 < 10 && valor2 < 2;
        // System.out.println(expressao2);
        boolean expressaoOr = valor1 < 10 || valor2 < 2;
        // System.out.println(expressaoOr);

        boolean expressaoNegada = (2 < 1);
        System.out.println(expressaoNegada);
        System.out.println(!expressaoNegada);
    }
}
