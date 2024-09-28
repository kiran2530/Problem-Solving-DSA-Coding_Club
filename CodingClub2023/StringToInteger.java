package CodingClub2023;
public class StringToInteger {
    static boolean flag = false;
    public static int myAtoi(String s) {
        String s1 = "";
        for(int i=0; i<s.length(); i++) {
            if((s.charAt(i) == ' ') || (s.charAt(i) == '+')){
                continue;
            }
            if(s.charAt(i) == '-') {
                flag = true;
                continue;
            }
            if(((int)s.charAt(i)-48) <= 9 && ((int)s.charAt(i)-48) >= 0)
                s1 += s.charAt(i);
            else
                break;
        }
        int num = 0;
        for(int i=0; i<s1.length(); i++) {
            num = num*10 + ((int)s1.charAt(i)-48);
        }
        
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else if(num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else if(flag)
            return -1 * num;
        else
            return num;

    }
    public static void main(String[] args) {
        String s = "   -4193 with words.";
        System.out.println(myAtoi(s));
    }
}
