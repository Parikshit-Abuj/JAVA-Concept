public class RegularExpression2 {

    public static void main(String[] args) {

        String str1 = "abcdef";
        System.out.println(str1.matches("[abc]*"));

        String str2 = "accbdefg";
        System.out.println(str2.matches("[abc]{3,7}"));

        String str3 = "john@gmail.com";
        System.out.println(str3.matches("\\w*@gmail(.*)"));
    }
}

OUTPUT
true
false
true
