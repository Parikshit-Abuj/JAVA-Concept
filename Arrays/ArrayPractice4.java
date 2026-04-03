public class ArrayPractice4 
{
    public static void main(String[] args) 
    {
        int A[] = {8,6,10,9,2};

        System.out.println("Length of A=" + A.length);

        int B[] = new int[10];

        for(int i=0;i<A.length;i++)
            B[i] = A[i];

        A = B;

        System.out.println("Length of A=" + A.length);

        int C[] = new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            C[j] = A[i];

        for(int i=0;i<5;i++)
            System.out.print(C[i] + " ");
    }
}

OUTPUT
Length of A=5
Length of A=10
2 9 10 6 8
