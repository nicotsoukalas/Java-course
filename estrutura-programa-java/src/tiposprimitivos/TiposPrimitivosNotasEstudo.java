package tiposprimitivos;

    /*
    * Notas de estudo sobre os tipos primitivos do Java.
    * Tipos primitivos são providos pela linguagem nativamente.
    */
         
public class TiposPrimitivosNotasEstudo {
    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'N';
        char letraASCII = 71;

        System.out.println(primeiraLetraDoNome);
        System.out.println(letraASCII);

        // Inteiros ou Integers

        byte nota = 10; // -128 até 127
        short itensComprados = 2; // -32768 até 32767
        int quantidadeEstoque = 23366; // -2_147_438_648 até 2_147_483_647
        long numeroMuitoGrande = 413415376526525235L; // 19 dígitos precisa colocar L no final
        
        // Tipos Decimais
        float peso = 1.5f; // 6 a  casas decimais - precisa colocar o "f"
        double preco = 24.99; // ~15 casas decimais
        boolean verdadeiro = true;
        boolean falso = false;
    }
}
