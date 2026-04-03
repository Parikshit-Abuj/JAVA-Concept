public class ArrayPractice1 {

    public static void main(String[] args) {

        int A[] = new int[10];
        int B[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();

        for (int x : B) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int x : B) {
            System.out.print(x++ + " ");
        }

        System.out.println();

        for (int x : B) {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]++ + " ");
        }

        System.out.println();

        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();

        System.out.println(B.length);
    }
}

OUTPUT
0 0 0 0 0 0 0 0 0 0 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
2 3 4 5 6 
5
