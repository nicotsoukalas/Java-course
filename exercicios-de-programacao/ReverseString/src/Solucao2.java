public class Solucao2 {
    public static void main(String[] args) {
        System.out.println(reverseString("Nicolaos de Freitas"));
    }

    private static String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) 
            reversed.append(string.charAt(i));
            return reversed.toString();
        }
    }

