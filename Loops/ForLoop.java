public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        for (System.out.println("Hi"); i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int count = 0;
        for (;;) {
            System.out.print(count + " ");
            count++;
            if (count == 5)
                break;
        }

        System.out.println();

        for (int x = 0, j = 1; x <= 10; x++, j = j * 2) {
            System.out.println("i=" + x + " j=" + j);
        }
    }
}

OUTPUT
0 1 2 3 4 5 6 7 8 9 10 
5 4 3 2 1 
Hi
0 1 2 3 4 5 
0 1 2 3 4 
i=0 j=1
i=1 j=2
i=2 j=4
i=3 j=8
i=4 j=16
i=5 j=32
i=6 j=64
i=7 j=128
i=8 j=256
i=9 j=512
i=10 j=1024
