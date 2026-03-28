public class StringProblem {

    public static void main(String[] args) {

        String[] emails = {"programmer@gmail.com", "programmer@hotmail.com"};

        for (String str : emails) {
            int i = str.indexOf("@");
            String uname = str.substring(0, i);
            String domain = str.substring(i + 1);

            System.out.println("Email: " + str);
            System.out.println("Username :" + uname);
            System.out.println("Domain :" + domain);
            System.out.println(domain.startsWith("gmail"));
            System.out.println();
        }
    }
}

OUTPUT
Email: programmer@gmail.com
Username :programmer
Domain :gmail.com
true

Email: programmer@hotmail.com
Username :programmer
Domain :hotmail.com
false
