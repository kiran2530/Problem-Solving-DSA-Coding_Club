package String;
public class PrintStars {
    public static void printStars(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j<arr[i]; j++) {
                for(int k = 0; k<=j; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] starts = {5,0,1,11,0,2,7};
        printStars(starts);
    }
}
