public class ReverseNestedForLoop {
public static final int N=1;
  public static void main(String[] args) {
    for(int line = 7; line >= N;line--) {
      
      for( int j=7; j >= (-1 * line + N); j--) {
        System.out.println(" ");
      }
      
      System.out.println(line);
      
      for (int i = 7; i >= 2 * line - 1; i--) {
    }
      System.out.println(line);
  }
}
 
}