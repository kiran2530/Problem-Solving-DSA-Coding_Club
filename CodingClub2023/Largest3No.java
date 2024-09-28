package CodingClub2023;
public class Largest3No {
    public static int[] findLargest3No(int[] a) {
        int[] Numbers = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int i=0; i<a.length; i++) {
            if(Numbers[0] < a[i]) {
                Numbers[2] = Numbers[1];
                Numbers[1] = Numbers[0];
                Numbers[0] = a[i];
            }
            else if(Numbers[1] < a[i] && a[i] != Numbers[0]) {
                Numbers[2] = Numbers[1];
                Numbers[1] = a[i];
            }
            else if(Numbers[2] < a[i] && a[i] != Numbers[0] && a[i] != Numbers[1]) {
                Numbers[2] = a[i];
            }
        }
        return Numbers;
    }

    // public static int[] findLargest3No(int[] a) {
    //     for(int i=1; i<a.length; i++) {
    //         if(a[0] < a[i]) {
    //             int temp = a[0];
    //             a[0] = a[i];
    //             a[i] = temp;
    //             i--;
    //         }
    //         else if(a[1] < a[i] && a[0] != a[i]) {
    //             int temp = a[1];
    //             a[1] = a[i];
    //             a[i] = temp;
    //             i--;
    //         }
    //         else if(a[2] < a[i] && a[0] != a[i] && a[1] != a[i]) {
    //             int temp = a[2];
    //             a[2] = a[i];
    //             a[i] = temp;
    //             i--;
    //         }
    //     }
    //     return a;
    // }

    public static void main(String[] args) {
        // int[] a = {10,4,3,50,23,90};
        int[] a = {7,8,9,9,10,10,10};
        int[] no = findLargest3No(a);

        for(int i=0; i<3; i++) {
            System.out.print(no[i] + " ");
        }
    }
}