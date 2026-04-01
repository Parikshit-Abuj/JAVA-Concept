import java.util.Scanner;

class WhileLoopPractice1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
      
        //DISPLAYS DIGITS
        //COUNT DIGITS
        //ARMSTRON NUMBER CHECK
        System.out.println("Enter a Number");
        int n = scan.nextInt();

        int temp = n;

        int r;
        int count = 0;
        int sum = 0;

        while (temp > 0)
        {
            r = temp % 10;
            System.out.println(r);
            sum = sum + r * r * r;
            temp = temp / 10;
            count++;
        }

        System.out.println("Total Digits: " + count);

        if (sum == n)
            System.out.println("Its a Armstrong Number");
        else
            System.out.println("Its not an Armstrong Number");
    }
}

OUTPUT
Enter a Number
153
3
5
1
Total Digits: 3
Its a Armstrong Number
