/* 
Q) 2 X 2

*   *   
  *   * 
*   *   
  *   * 

Q) 3 X 3

*     *     *     
  *     *     *   
    *     *     * 
*     *     *     
  *     *     *   
    *     *     * 
*     *     *     
  *     *     *   
    *     *     * 

*/
public class GreedDigonalStars {
    public static void printGreedDigonalStars(int n) {
        for(int k=1; k<=n; k++) {
            for(int i=1; i<=n; i++) {
                for(int m=1; m<=n; m++) {
                    for(int j=1; j<=n; j++) {
                        if(i==j) {
                            System.out.print("*");
                        }
                        else {
                            System.out.print(" ");
                        }
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        /*
        for(int i = 1; i<=n*n; i++) {
            for (int j = 1; j <= n*n; j++) {
                if(j%n == i%n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        */
    }
    public static void main(String[] args) {
        int n = 3;
        printGreedDigonalStars(n);
    }
}
