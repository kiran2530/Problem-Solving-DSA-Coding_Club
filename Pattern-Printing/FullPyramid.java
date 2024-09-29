/*
// full

     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

// Reverse Full

* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

// hollow full
     
     *
    * *
   *   *
  *     *
 *       *
* * * * * *

 */
public class FullPyramid {
    public static void printFullPyramid(int n) {
        //  Full
        /*
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(j%2 == 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        */

        // Reverse Full
        /*
        for (int i = n; i >= 1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(j%2 == 1) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        */
        // hollow full 
        
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                if(j == 1 || j == (2*i)-1 || (i == n && j%2 == 1)) {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
         
    }
    public static void main(String[] args) {
        int n = 6;
        printFullPyramid(n);
    }
}
