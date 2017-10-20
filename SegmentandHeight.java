public class SegmentandHeight {

 public static void main(String[] args) {
   int A = 4;
     for (int yo = 0; yo <= A; yo++) { 
    yo++;
  for (int i = 0; i < 4; i++) {
   for (int j = 0; j < 10 - i; j++)
    System.out.print(" ");
   for (int k = 0; k < (2 * i + 1); k++)
    System.out.print("*");
   System.out.println();
  }
 }
}
}

