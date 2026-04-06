public class VarArgsPractice {

    static int max(int... nums) {
        int max = nums[0];
        for (int x : nums) {
            if (x > max)
                max = x;
        }
        return max;
    }

    static int sum(int... nums) {
        int s = 0;
        for (int x : nums) {
            s += x;
        }
        return s;
    }

    static double discount(double... prices) {
        double total = 0;
        for (double p : prices) {
            total += p;
        }

        if (total > 1000)
            total = total * 0.9;

        return total;
    }

    public static void main(String[] args) {

        System.out.println("Max: " + max(2, 5, 9, 3, 7));

        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));

        System.out.println("Final Price after Discount: " + discount(200, 300, 600));
    }
}

OUTPUT
Max: 9
Sum: 15
Final Price after Discount: 990.0
