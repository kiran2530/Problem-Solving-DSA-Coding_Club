import java.util.Arrays;

public class ArraySeperateEvenOdd {
    public static int[] seperateEvenOdd(int[] arr,int n) {
        int evenIdx = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[evenIdx];
                arr[evenIdx] = temp;
                evenIdx++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7,2,9,4,6,1,3,8,5};
        int[] seperateArr = seperateEvenOdd(arr, arr.length);

        for(int i=0; i<arr.length; i++) {
            System.out.print(seperateArr[i] + " ");
        }
    }
}
