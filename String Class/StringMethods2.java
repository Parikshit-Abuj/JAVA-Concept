public class StringMethods2 {

    public static void main(String[] args) {

        String str1 = "Mr. Shahrukh Khan";

        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah", 4));
        System.out.println(str1.endsWith("Khan"));
        System.out.println(str1.charAt(4));

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }

        System.out.println();

        String str2 = "www.udemy.co.in";

        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 4));
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.lastIndexOf("."));
    }
}

OUTPUT
true
true
true
S
Mr. Shahrukh Khan
3
9
4
12
