package CodingClub2023;
public class TargetInRotetedArray {
    public static int returnPivot(int[] a) {
        int i = 0, j = a.length-1;
        while(i<j) {
            int mid = i + (j-i)/2;
            if(a[mid] > a[j]) {
                i = mid + 1;
            }
            else
                j = mid;
        }
        return i;
    }

    public static boolean targetInArray(int[] a, int target) {
        int i = 0, j = a.length-1;
        int pivot = returnPivot(a);
        
        if(target >= a[pivot] && target <= a[j])
            i = pivot;
        else
            j = pivot;

        while(i<j) {
            int mid = i + (j-i)/2 ;

            if(a[mid] == target)
                return true;
            else if(a[mid] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {2,5,6,0,0,1,2};
        int target = 0;

        System.out.println(targetInArray(a, target));
    }
}