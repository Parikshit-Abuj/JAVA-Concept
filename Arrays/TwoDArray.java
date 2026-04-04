public class TwoDArray 
{
    public static void main(String[] args) 
    {
        int A[][] = new int[5][5];

        int B[][];
        B = new int[5][5];

        int[][] C = new int[5][5];
        int[] D[] = new int[5][5];

        int[] E[], F;
        E = new int[5][5];
        F = new int[5];

        int[] G, H, I;

        int M[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int X[][];
        X = new int[3][];
        X[0] = new int[5];
        X[1] = new int[3];
        X[2] = new int[8];

        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[i].length;j++)
            {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        for(int x[] : M)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}

OUTPUT
1 2 3 4 
5 6 7 8 
9 10 11 12 
1 2 3 4 
5 6 7 8 
9 10 11 12 
