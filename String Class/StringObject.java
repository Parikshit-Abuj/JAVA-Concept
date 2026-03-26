public class StringObject{
  public static void main(String args[]){
    
    char c[] = {'A','B','C','D'};
    String s1 = new String(c);
    
    byte b[] = {1,2,3,4,5};
    String s2 = new String(b);

    String s3 = "java"                       //CREATED IN POOL
    String s4 = new String("java")           //CREATED IN HEAP
      }
}
