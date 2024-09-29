import java.util.Arrays;

public class KthLargestSumOfContiguosSubArray {
    public static int findKthLargestSumOfContiguosSubArray(int[] a, int n, int k) {
        int[] sumArray = new int[n*(n+1)/2];
        int index = 0;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum += a[j];
                sumArray[index++] = sum;
            }
        }
        Arrays.sort(sumArray);
        return(sumArray[sumArray.length - k]);
    }
    public static void main(String[] args) {
        int[] a = {20,-5,-1};
        // int[] a = {10,-10,20,-40};
        int k = 3;

        System.out.println(findKthLargestSumOfContiguosSubArray(a, a.length, k));
    }
}
