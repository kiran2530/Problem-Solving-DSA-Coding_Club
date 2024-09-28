/*
    Q) Hollow pyramid

           *
          * *
         *   *
        *******

 */
public class HollowPyramid {
    public static void printHallowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // For printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //  For printing Stars and between spaces
            for(int j = 1; j <= 2*i-1; j++) {
                if(j == 1 || j == (2*i-1) || i == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printHallowPyramid(n);
    }
}
