 /* Q) Given an array of elements of length N, ranging from 0 to n-1. All elements may not be
       present in the array. If the element is not present then there will be -1 present in the
       array. Rearrange the array such that A[i] = i and if i is not present, display -1 at that place. */

import java.util.HashMap;
public class RearrangeArrayNumbers {
    public static int[] rearrangeArrayNumbers(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(i,a[i]);
        }

        int[] rearrangedArr = new int[n];
        for(int i=0; i<n; i++) {
            if(map.containsValue(i))
                rearrangedArr[i] = i;
            else
                rearrangedArr[i] = -1;
        }
        return rearrangedArr;
    }
    public static void main(String[] args) {
        int[] a = {-1,-1,6,1,9,3,2,-1,4,-1};
        int[] rearrangedArr = rearrangeArrayNumbers(a, a.length);

        for(int i=0; i<a.length; i++) {
            System.out.print(rearrangedArr[i] + " ");
        }
    }
}
