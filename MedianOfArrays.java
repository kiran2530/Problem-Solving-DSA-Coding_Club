import java.util.Arrays;
public class MedianOfArrays {
    public static double median(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        for(int i=0,j=0; i<n+m; i++) {
            if(i>=m) {
                c[i] = b[j];
                j++;
            }
            else
                c[i] = a[i];
        }
        Arrays.sort(c);
        if(m+n % 2 ==0)
            return (double)c[(m+n)/2];
        else
            return (double)(c[(m+n)/2] + c[(m+n-1)/2])/2;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double a = median(nums1, nums2);
        System.out.printf("%.5f",a);
    }
}