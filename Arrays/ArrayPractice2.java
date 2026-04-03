import java.util.*;

public class ArrayPractice2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};

        //TO FIND SECOND LARGEST ELEMENT
        int max1, max2;
        max1 = max2 = A[0];

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }
            else if (A[i] > max2 && A[i] != max1)
            {
                max2 = A[i];
            }
        }

        System.out.println("Second Largest is " + max2);

        //TO FIND ELEMENT IN AN ARRAY
        System.out.println("Enter a Key");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == key)
            {
                System.out.println("Element Found at: " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Not found");

        //SUM OF ALL ELEMENTS OF AN ARRAY
        int sum = 0;

        for (int x : A)
        {
            sum = sum + x;
        }

        System.out.println("Sum is " + sum);
    }
}

OUTPUT
Second Largest is 12
Enter a Key
7
Element Found at: 2
Sum is 79
