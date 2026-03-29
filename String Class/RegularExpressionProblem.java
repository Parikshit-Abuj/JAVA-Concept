package scstring;

public class RegularExpressionProblem {

    static boolean isBinary(String str) {
        return str.matches("[01]+");
    }

    static String removeSpecial(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    static int countWords(String str) {
        str = str.replaceAll("\\s+", " ").trim();
        return str.split("\\s").length;
    }

    public static void main(String[] args) {

        String binary = "100110010";
        System.out.println(isBinary(binary));

        String special = "a!B@c#1$2%3";
        System.out.println(removeSpecial(special));

        String sentence = "      abc     def     gh   ijk    ";
        System.out.println(countWords(sentence));
    }
}

OUTPUT
true
aBc123
4
