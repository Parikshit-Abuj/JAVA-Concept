Java Operator Precedence (Highest to Lowest)

1. ()                          // Parentheses
2. postfix: ++  --             // Post-increment, post-decrement
3. unary: ++ -- + - ! ~        // Pre-increment, pre-decrement, unary plus/minus, NOT, bitwise NOT
4. *  /  %                     // Multiplication, Division, Modulus
5. +  -                        // Addition, Subtraction
6. <<  >>  >>>                 // Shift operators
7. <  <=  >  >=  instanceof    // Relational operators
8. ==  !=                      // Equality operators
9. &                           // Bitwise AND
10. ^                          // Bitwise XOR
11. |                          // Bitwise OR
12. &&                         // Logical AND
13. ||                         // Logical OR
14. ?:                         // Ternary operator
15. =  +=  -=  *=  /=  %=      // Assignment operators 

package arithematic;

public class Arithematic {

    public static void main(String[] args) {
        
        for integer values
        int a=14,b=5;
        
        int c=a/b;
        int r=a%b;
        
        System.out.println(c);
        System.out.println(r);
        
        
        
        for float values
        float a=14.3f,b=3.2f;
         
        float c=a/b;
        float r=a%b;
        
        System.out.println(c);
        System.out.println(r);
        
        
        
        for different data types
        byte a=10;
        short b=15;
        int c=a+b;
        
        float a=12.5f;
        long b=1231;
        float c=a*b;
        
        float a=12.5f;
        double b=123;
        double c=a*b;
        
        char a=40;
        int b=30;
        int c=a-b;
        System.out.println(c);
        
        
        
        System.out.println((10+20)/2);
        System.out.println(10/(2*5));
    }
    
}
