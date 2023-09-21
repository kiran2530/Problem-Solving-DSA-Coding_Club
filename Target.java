import java.util.ArrayList;
public class Target {
    public static ArrayList<Integer> target(int[] a, int tar) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        result.add(-1);
        for(int i=0; i<a.length; i++) {
            if(a[i] > tar)
                break;
            if(a[i] == tar) {
                if(result.get(0) == -1) {
                    result.set(0, i);
                    result.set(1, i);
                }
                else {
                    result.set(1, i);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {5,7,7,8,8,10};
        int tar = 8;
        System.out.println(target(a, tar));
    }
}
