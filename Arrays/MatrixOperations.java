public class MatrixOperations
{
    public static void main(String args[])
    {
        String arr[] = {"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String x : arr)
            System.out.print(x + " ");
        System.out.println();

        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int C[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        int D[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int E[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                E[i][j] = 0;
                for(int k=0;k<3;k++)
                {
                    E[i][j] = E[i][j] + A[i][k] * D[k][j];
                }
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
    }
}

OUTPUT
ada basic java pascal python smalltalk 
4 10 11 
13 14 6 
7 12 12 
3 5 9 
7 6 2 
4 3 5 
