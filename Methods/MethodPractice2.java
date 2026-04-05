public class MethodPractice2 
{
    int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n) m=m-n;
            else n=n-m;
        }
        return m;
    }
            
    static boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        SCMethod1 obj = new SCMethod1();

        System.out.println(obj.gcd(35,56));

        System.out.println(isPrime(11));
        System.out.println(isPrime(12));
    } 
}

OUTPUT
7
true
false
