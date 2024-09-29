/*
Q)  Given an array arr[] of integers and a number x, the task is to find the smallest subarray
    with a sum greater than the given value.

    examples : 

    1)  arr[] = {1,4,45,6,0,19}
        x = 51
        output : 3
        minimum length subarray is {4,45,6}

    2)  arr[] = {1,11,100,1,0,200,3,2,1,250}
        x = 280
        output : 4
        minimum length subarray is {100,1,0,200}
*/

public class MinimumLengthSubArrayWithSumGreaterThanX {
    public static int findMinimumLength(int[] a, int n, int x) {
        int max = Integer.MAX_VALUE;
        int result = -1;
        for(int i=0; i<n; i++) {
            int sum = 0, count = 0;
            if(x < a[i] && a[i] < max)
                count = 1;
            sum = a[i];
            for(int j=i+1; j<n; j++) {
                sum += a[j];
                if(x < sum && sum < max) {
                    max = sum;
                    count = j-i+1 ;
                }
            }
            if(result == -1 && count != 0)
                result = count;
            else if(result > count && count != 0)
                result = count;
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] arr = {1,4,45,6,0,19};
        // int[] arr = {1,11,100,1,0,200,3,2,1,250};
        int[] arr = {5,2};
        int x = 1;
        System.out.println(findMinimumLength(arr, arr.length, x));
    }
}