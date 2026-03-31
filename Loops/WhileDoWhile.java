public class WhileDoWhile {

    public static void main(String[] args) {

        int a = 1;
        while (a < 100) {
            System.out.print(a + " ");
            a = a * 2;
        }

        System.out.println();

        int b = 1;
        do {
            System.out.print(b + " ");
            b = b * 2;
        } while (b < 100);

        System.out.println();

        byte c = 125;
        int count = 0;
        while (count < 5) {
            System.out.print(c + " ");
            c++;
            count++;
        }

        System.out.println();

        byte d = 1;
        if (true) {
            System.out.println(d);
            d++;
        } else {
            System.out.println("Bye");
        }
    }
}

OUTPUT
1 2 4 8 16 32 64
1 2 4 8 16 32 64
125 126 127 -128 -127
1
