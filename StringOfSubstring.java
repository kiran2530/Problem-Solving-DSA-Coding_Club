public class StringOfSubstring {
    public static boolean isTure(String s) {
        double count = 1.0;
        String s1 = "" + s.charAt(0);
        int idx = 0;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s1.charAt(0)) {
                int k = i;
                for(int j = 0; j<s1.length() && k < s.length() ; j++) {
                    if(s1.charAt(j) == s.charAt(k)) {
                        k++;
                        if(j == s1.length()-1) {
                            i = k-1;
                            count += 1.0;
                        }
                        if(k == (s.length()) && count == ((double)s.length() / s1.length())) {
                            return true;
                        }
                    }
                    else {
                        s1 = s1 + s.charAt(i);
                        break;
                    }
                }
            }
            else {
                s1 = s1 + s.charAt(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        System.out.println(isTure(s));
    }
}