/*
    Q) Pyramid

       *
      ***
     *****
    *******
 */

public class Pyramid {
    public static void printHollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printHollowPyramid(n);
    }
}
