class BitwiseOperator {
  public static void main (String args[]){
    int x = 20;
    int y, a, b, c;

    y = x << 1;
    a = x >> 1;
    b = x >>> 1;
    c = ~x;

    System.out.println(y);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
