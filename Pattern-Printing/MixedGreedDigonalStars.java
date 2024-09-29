/*

Q) 3 X 3

*         * *
  *     *     *
    * *         *
*         * *
  *     *     *
    * *         *
*         * *
  *     *     *
    * *         *

*/
public class MixedGreedDigonalStars {
    public static void printMixedGreedDigonalStars(int n) {
        for(int k=1; k<=n; k++) {
            for(int i=1; i<=n; i++) {
                for(int m=1; m<=n; m++) {
                    for(int j=1; j<=n; j++) {
                        if(m%2 == 1) {
                            if(i==j) {
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                        else {
                            if((i+j)%n == 1) {
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }

                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printMixedGreedDigonalStars(n);
    }
}
