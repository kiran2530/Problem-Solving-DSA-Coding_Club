import java.util.*;
public class MergeArrays {
    public static int[] mergeArrays(int[] a, int[] b, int m, int n) {
        if(m == 0) 
            return b;
        if(n ==0 )
            return a;
        for(int i=m,j=0; i<n+m; i++,j++) {
            a[i] = b[j];
        }
        Arrays.sort(a);
        return a;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3;
        int n = 3;

        num1 = mergeArrays(num1, num2, m, n);

        for(int i=0; i<m+n; i++) 
            System.out.print(num1[i] + " ");
    }
}