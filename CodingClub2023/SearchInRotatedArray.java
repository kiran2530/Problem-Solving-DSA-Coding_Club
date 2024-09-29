public class SearchInRotatedArray {
    public static int searchInRotatedArray(int[] arr, int n, int key) {
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = (high+low)/2;
            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key) {
                if((arr[low] > arr[mid]) && (arr[low] <= key))
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if((arr[high] < arr[mid]) && (arr[mid] >= key))
                    low = mid + 1 ;  
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3};
        // int[] arr = {30,40,50,10,20};
        int key = 8;
        System.out.println(searchInRotatedArray(arr, arr.length, key));
    }
}
