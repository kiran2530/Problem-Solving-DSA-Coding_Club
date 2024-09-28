package CodingClub2023;
import java.util.ArrayList;

public class NotDistinct {
    public static boolean isNotDistinct(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<a.length; i++) {
            if(list.contains(a[i])) {
                return true;
            }
            else{
                list.add(a[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(isNotDistinct(nums));
    }
}