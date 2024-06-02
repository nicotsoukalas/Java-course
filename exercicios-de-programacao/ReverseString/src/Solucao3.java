public class Solucao3 {
    public static void main(String[] args) {
        System.out.println(reverseString("Nicolaos de Freitas"));
    }

    private static String reverseString(String string) {
        var arrayReverse = string.toCharArray();

        var lastIndex = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {

            arrayReverse[i] = string.charAt(lastIndex - i);
            arrayReverse[lastIndex - 1] = string.charAt(i);
        }
        return String.valueOf(arrayReverse);
    }
}
