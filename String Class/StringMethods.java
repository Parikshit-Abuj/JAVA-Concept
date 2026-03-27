public class StringMethods {

    public static void main(String[] args) {

        String str = new String("netbeans");

        int len = str.length();
        System.out.println(len);

        String strUpper = str.toUpperCase();
        System.out.println(strUpper);

        str = str.trim();
        System.out.println(str);

        String strSub = str.substring(3);
        System.out.println(strSub);

        String str2 = str.replace('e', 'M');
        System.out.println(str2 + " " + str);
    }
}

OUTPUT:
8
NETBEANS
netbeans
beans
nMtbMans netbeans
