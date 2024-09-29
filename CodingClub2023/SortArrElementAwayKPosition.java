/*
    Q)  Given an array of N elements, where each element is at most K away from its target position, 
        devise an algorithm that sorts in O(N log K).

    Examples : 
        Input   : arr[] = {6,5,3,2,8,10,9} , K = 3
        Output  : arr[] = {2,3,5,6,8,9,10}

        Input   : arr[] = {10,9,8,7,4,70,60,50} , K = 4
        Output  : arr[] = {4,7,8,9,10,50,60,70}
*/

public class SortArrElementAwayKPosition {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] sortArray(int[] arr, int k) {
        for(int i=0; i<arr.length-1; i++) {
            int start = i+1, end ;
            if(i + k >= arr.length)
                end = arr.length-1;
            else
                end = i+k;

            while (start <= end) {
                if(arr[i] > arr[start])
                    swap(arr, i, start++);
                else 
                    start++;
                if(arr[i] > arr[end])
                    swap(arr, i, end--);
                else
                    end--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        // int[] arr = {10,9,8,7,4,70,60,50};
        int k = 3;

        int[] temp = sortArray(arr, k);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}