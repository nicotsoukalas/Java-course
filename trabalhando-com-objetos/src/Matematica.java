public class Matematica {

    public static Double limite = 100.0;
    public static Double soma(double n1, double n2) {
        double soma = n1 + n2;
        if (soma > limite)
            return limite;
        else return soma;
    }
    public Double somaNaoEstatica(double n1, double n2) {
        double soma = n1 + n2;
        if (soma > limite)
            return limite;
        else return soma;
    }
}
