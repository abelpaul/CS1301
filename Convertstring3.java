import java.util.*;
public class Convertstring3 {
  public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    String a = s.next();
    int n = a.length();
    String s1=a.substring(0,n/2);
    String s2=a.substring(n/2);
    System.out.println(s1.toUpperCase()+s2.toLowerCase());
  }
}