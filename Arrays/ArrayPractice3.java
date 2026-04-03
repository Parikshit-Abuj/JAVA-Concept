public class ArrayPractice3 
{
    public static void main(String[] args) 
    {
        int A[] = new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

        int n = 6;

        int x = 20, index = 2;
        for(int i=n;i>index;i--)
            A[i] = A[i-1];
        A[index] = x;
        n++;

        for(int i=0;i<n;i++)
            System.out.print(A[i] + " ");
        System.out.println();

        int delIndex = 3;
        for(int i=delIndex;i<n-1;i++)
            A[i] = A[i+1];
        n--;

        for(int i=0;i<n;i++)
            System.out.print(A[i] + " ");
        System.out.println();

        int temp = A[0];
        for(int i=1;i<n;i++)
            A[i-1] = A[i];
        A[n-1] = temp;

        for(int i=0;i<n;i++)
            System.out.print(A[i] + " ");
    }
}

OUTPUT
3 9 20 7 8 12 6 
3 9 20 8 12 6 
9 20 8 12 6 3
