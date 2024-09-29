/* Q) Given two integer arrays of the same size, "arr[]" and "index[]", reorder elements in "arr[]" 
 *    according to the given index array.
*/
public class ReorderArrayWithRespectToIndexArray {
    public static void swap(int[] a , int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int[] reorderArray(int[] arr, int[] index, int n) {
        for(int i=0; i<n; i++) {
            swap(arr, i, index[i]);
            swap(index, i, index[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        // int[] arr = {10,11,12};
        // int[] index = {1,0,2};
        int[] arr = {50,40,70,60,90};
        int[] index = {3,0,4,1,2};
        
        int[] reorderArray = reorderArray(arr, index, arr.length);
        for(int i=0; i<arr.length; i++) {
            System.out.print(reorderArray[i] + " ");
        }
    }
}