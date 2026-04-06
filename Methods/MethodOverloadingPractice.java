public class MethodOverloadingPractice 
{
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }
    
    int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    
    int[] reverse(int A[])
    {
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];
        return B;
    }
    
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    static double area(double length,double breadth)
    {
        return length*breadth;
    }

    public static void main(String[] args) 
    {
        MethodOverloadingPractice obj = new MethodOverloadingPractice();

        System.out.println(obj.validate("Chiku Abuj"));
        System.out.println(obj.validate(10));

        System.out.println(obj.reverse(1234));

        int A[] = {1,2,3,4,5};
        int B[] = obj.reverse(A);

        for(int x : B)
            System.out.print(x + " ");
        System.out.println();

        System.out.println(area(5));
        System.out.println(area(4,6));
    } 
}

OUTPUT
true
true
4321
5 4 3 2 1 
78.53981633974483
24.0
