public class StringMethods3 {

    public static void main(String[] args) {

        String a1 = "Pyramid";
        String a2 = "pyramid";

        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));

        String b1 = "china wall";
        String b2 = new String("china tall");

        System.out.println(b1.compareTo(b2));

        String c1 = "the great wall ";
        String c2 = "of china";

        System.out.println(c1.contains("wall"));
        System.out.println(c1.concat(c2));

    }
}

OUTPUT
false
true
3
true
the great wall of china
