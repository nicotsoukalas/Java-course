package casting;

    /*
     * casting: Operação para transformar um tipo de dado em outro.
     * Widening casting vs Narrowing casting.
     */
public class CastingNotasEstudo {
    public static void main(String[] args) {
        // Widening casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        // System.out.println(variavelPequena);
        // System.out.println(variavelGrande);
        // System.out.println(variavelShort);

        // Narrowing casting (Explícito)
        long variavelLong = 6546723457233532L;
        int variavelInt2 = (int) variavelLong;
        // System.out.println(variavelInt2);

        // Operações de divisão entre números inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao1 = (float) numero1 / numero2;
        float resultadoDivisao2 = (float) (numero1 / numero2);
        float resultadoDivisao3 = numero1 / (float) numero2;
        System.out.println(resultadoDivisao1);
        System.out.println(resultadoDivisao2);
        System.out.println(resultadoDivisao3);
    }
}
