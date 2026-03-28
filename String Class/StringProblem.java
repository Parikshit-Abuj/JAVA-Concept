public class StringProblem {

    public static void main(String[] args) {

        String[] emails = {"programmer@gmail.com", "programmer@hotmail.com"};

        for (String str : emails) {
            int i = str.indexOf("@");
            String uname = str.substring(0, i);
            String domain = str.substring(i + 1, str.length());

            System.out.println("Email: " + str);
            System.out.println("Username :" + uname);
            System.out.println("Domain :" + domain);

            int j = domain.indexOf(".");
            String name = domain.substring(0, j);
            System.out.println(name.equals("gmail"));
            System.out.println();
        }
    }
}
