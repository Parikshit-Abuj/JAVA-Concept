public class RegularExpressionProblem2 {
    public static void main(String[] args) {

        String str = "   a!B@c#1$2%3   abc     def     gh   ijk   ";

        String noSpecial = str.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(noSpecial);

        String clean = noSpecial.replaceAll("\\s+", " ").trim();
        System.out.println(clean);

        String words[] = clean.split("\\s");
        System.out.println(words.length);
    }
}

OUTPUT
   aBc123   abc     def     gh   ijk   
aBc123 abc def gh ijk
5

