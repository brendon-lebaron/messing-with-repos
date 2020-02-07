import java.lang.Math;
public class Test{
   public static void main(String[] args){
      cout("what's up " + rand(5));
   }
   
   public static void cout(String s){
      System.out.print(s);
   }
   public static int rand(int bound){
      double r = Math.random();
      String s = String.format("%d",bound);
      int i = s.length();
      return (int) (Math.pow(10,i) * r)%bound + 1;
   }
}