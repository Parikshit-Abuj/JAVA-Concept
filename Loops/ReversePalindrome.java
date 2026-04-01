import java.util.*;

public class ReversePalindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int original = n;
        int rev = 0;
        
        while(n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        
        System.out.println("Reversed number: " + rev);
        
        if(original == rev)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}

OUTPUT
Enter a number:
121
Reversed number: 121
Palindrome Number
