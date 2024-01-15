/*
Q)  Given an array arr[] of N integers, the task is to count the number of smaller elements on the right side for each of the element in the array.

    examples : 

    1)  arr[] = {6,3,7,2}
        output : 2,1,1,0
        Explanation : 
            Smallest elements after 6 = 2 {3,2}
            Smallest elements after 3 = 1 {2}
            Smallest elements after 7 = 1 {2}
            Smallest elements after 2 = 0 

    2)  arr[] = {6,19,111,13}
        output : 0,1,1,0
        Explanation : 
            Smallest elements after 6 = 0 
            Smallest elements after 19 = 1 {13}
            Smallest elements after 111 = 1 {13}
            Smallest elements after 13 = 0 
*/

public class CountOfSmallestNoRightSideArrayElement {
    public static int[] findCounts(int[] a, int n) {
        int[] result = new int[n];
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(a[j] < a[i])
                    result[i]++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {6,3,7,2};
        int[] a = findCounts(arr, arr.length);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
    }
}
