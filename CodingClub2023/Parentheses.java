import java.util.ArrayList;

public class Parentheses {
    static ArrayList<String> list = new ArrayList<>();

    public static void well_Formed_Parentheses(String barce, int n, int open_brace, int close_brace) {
        if(barce.length() == 2*n) {
            list.add(barce);
            return;
        }
        // Backtracking....
        if(open_brace < n) {
            well_Formed_Parentheses(barce + "(", n, open_brace+1, close_brace); 
        }
        if(close_brace < open_brace) {
            well_Formed_Parentheses(barce + ")", n, open_brace, close_brace +1);
        }
    }
    
    public static void main(String[] args) {
        int n = 3;
        well_Formed_Parentheses("(", n, 1, 0);
        System.out.println(list);
    }
}
