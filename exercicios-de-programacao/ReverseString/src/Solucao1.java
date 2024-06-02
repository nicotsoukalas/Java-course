public class Solucao1 {
    public static void main(String[] args) {
        System.out.println(reverseString("Nicolaos de Freitas"));
    }

    private static String reverseString(String string) {
        var stringBuffer = new StringBuffer(string);
        return stringBuffer.reverse().toString();
    }
}
