/* 
    Q) 2 X 2
        * * 
         * *
        * * 
         * *
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
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int n = 2;
        printGreedDigonalStars(n);
    }
}
