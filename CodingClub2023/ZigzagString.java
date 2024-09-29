import java.util.*;
public class ZigzagString {
    static void zigzagString(String s, int n) {  
        if(n == 1) {
            System.out.println(s);
            return;
        }
        char[] s1 = s.toCharArray();

        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = "";
        }

        int row = 0;
        int flag = 1;
        for(int i=0; i<s.length(); i++) {
            str[row] += s1[i];

            if(row == n-1) 
                flag = 0; 
            else if(row == 0) 
                flag = 1;
            
            if(flag == 1)
                row++;
            else
                row--;
        }
        for(int i=0; i<n; i++)
            System.out.print(str[i]);
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";

        int n = 3;

        zigzagString(s, n);
    }
}