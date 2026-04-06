public class VarArgs {

    static int sum(int... numbers)
    {
        int s = 0;
        for(int x : numbers)
        {
            s = s + x;
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(5, 10, 15));
    }
}
