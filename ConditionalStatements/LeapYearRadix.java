import java.util.*;

public class LeapYearRadix
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Year");
        int year = scan.nextInt();

        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Its a Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println("Its a Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }

        scan.nextLine();

        System.out.println("Enter a Number");
        String num = scan.nextLine();

        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2");
        }
        else
        {
            if(num.matches("[0-7]+"))
            {
                System.out.println("Octal Radix=8");
            }
            else
            {
                if(num.matches("[0-9]+"))
                {
                    System.out.println("Decimal Radix=10");
                }
                else
                {
                    if(num.matches("[0-9A-Fa-f]+"))
                    {
                        System.out.println("Hexa Radix=16");
                    }
                    else
                    {
                        System.out.println("Not a Number");
                    }
                }
            }
        }

        scan.close();
    }
}
