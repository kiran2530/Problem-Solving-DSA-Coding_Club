import java.util.ArrayList;
public class Flowerbed {
    public static boolean isPlanted(ArrayList<Integer> a, int n) {
        for(int i = 0; i< a.size(); i++) {
            if(a.get(i)==0 && (i == 0 || a.get(i-1) == 0) && (i == a.size()-1 || a.get(i+1) == 0)) {
                a.set(i, 1);
                n--;
                if(n == 0) 
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(1);
        a.add(0);
        a.add(0);
        
        int n = 4;

        System.out.println(isPlanted(a, n));
    }
}