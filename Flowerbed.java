import java.util.ArrayList;
public class Flowerbed {
    public static boolean isPlanted(ArrayList<Integer> a, int n) {
        for(int i = 0; i< a.size()-1; i++) {
            if(a.get(i) == 1)
                continue;
            else if(a.get(i+1) == 1 || a.get(i-1) == 1)
                continue;
            else {
                n--;
                a.set(i, 1);
                if(n == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(0);
        a.add(0);
        a.add(0);
        a.add(1);
        
        int n = 2;

        System.out.println(isPlanted(a, n));
    }
}