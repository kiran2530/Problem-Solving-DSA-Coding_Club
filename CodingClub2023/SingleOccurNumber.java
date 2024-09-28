package CodingClub2023;
import java.util.Arrays;

public class SingleOccurNumber {
    public static int findSingleOccurNumber(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i=1; i<n; i+=2) {
            if(arr[i] != arr[i-1])
            return arr[i-1];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        System.out.println(findSingleOccurNumber(arr, arr.length));
    }
}