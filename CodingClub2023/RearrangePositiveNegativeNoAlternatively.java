package CodingClub2023;
/* Q) An array contains both positive and negative numbers in random order. Rearrange the array elements
      so that positive and negative numbers are placed alternatively. A number of positive and negative 
      numbers need not be equal. If there 'are more positive numbers they appear at the end of the array. 
      If there are more negative numbers, they too appear at the end of the array. */
      
import java.util.Arrays;
public class RearrangePositiveNegativeNoAlternatively {
    public static int[] alternateNumber(int[] a, int n) {
        Arrays.sort(a);
        int left = 0, right = n-1, index = 0;
        int[] alternateArr = new int[n];

        while(left < right) {
            alternateArr[index++] = a[right--];
            alternateArr[index++] = a[left++];
        }
        if(right == left)
            alternateArr[n-1] = a[right];
            
        return alternateArr;
    }
    public static void main(String[] args) {
        // int[] a = {-1,2,-3,4,5,6,-7,8,9};
        int[] a = {-1,3,-2,-4,7,-5};
        int[] alternateArr = alternateNumber(a, a.length);

        for(int i=0; i<a.length; i++) {
            System.out.print(alternateArr[i] + " ");
        }
    }
}
