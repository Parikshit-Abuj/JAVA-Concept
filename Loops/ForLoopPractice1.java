import java.util.*;

class ForLoopPractice1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      
        //FACTORIAL OF A NUMBER
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
      
        //SUM OF N NUMBERS
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of " + n + " Number is " + sum);
      
        //MULTIPLICATION OF A NUMBER    
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}

OUTPUT
Enter a Number
5
Factorial is 120
Sum of 5 Number is 15
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
