package CodingClub2023;
import java.util.*;
public class GoodPairs {
    public static int noOfGoodPairs(int[] a) {
        int count = 0 , n = 0;
        Arrays.sort(a);
        for(int i = 0; i<a.length-1; i++) {
            if(a[i] == a[i+1]) {
                n++;
            }
            else {
                count = count + (n*(n+1))/2;
                n = 0;
            }
            if(i == a.length-2) {
                count = count + (n*(n+1))/2;
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        System.out.println(noOfGoodPairs(a));
    }
}
