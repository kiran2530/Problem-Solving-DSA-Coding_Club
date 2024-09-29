/*
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
public class ReverseGreedDigonalStars {
    public static void printReverseGreedDigonalStars(int n) {
        for(int k=1; k<=n; k++) {
            for(int i=1; i<=n; i++) {
                for(int m=1; m<=n; m++) {
                    for(int j=1; j<=n; j++) {
                        if((i+j)%n == 1) {
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
                if((i+j)%n == 1) {
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
        printReverseGreedDigonalStars(n);
    }
}
