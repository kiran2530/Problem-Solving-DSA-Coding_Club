import java.util.ArrayList;
public class RotateArray {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> a, int k) {
        if(k == 0)
            return a;
        if(k > a.size())
            return a;
        
        int x = a.size()-1;
        for(int i = 0; i<k; i++) {
            int temp = a.get(x);
            a.remove(x);
            a.add(0,temp);
        }
        return a;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        int k = 3;

        System.out.println(rotateArray(a, k));
    }
}