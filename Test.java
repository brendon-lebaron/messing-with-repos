import java.lang.Math;
public class Test{
   public static void main(String[] args){
      cout("what's up " + rand(5));
      cout("\n" +rStr(5)+": " + x2(100));
   }
   
   public static void cout(String s){
      System.out.print(s);
   }

   public static int x2(int i){
      return i*2;
   }
   
   public static int rand(int bound){
      double r = Math.random();
      String s = String.format("%d",bound);
      int i = s.length();
      return (int) (Math.pow(10,i) * r)%bound + 1;
   }
   public static String rStr(int length){
      String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      s = s+"0123456789"+s.toLowerCase();
      String r = "";
      for(int i=0; i<length; i++){
         r = r+s.toCharArray()[(int)rand(s.length())%s.length()];
      }
      return r;
   }
}