public class LongestPalindrom {
    static String palindrom = "";
    
    public static boolean ispalindrom(String b) {
        int i =0;
        int j = b.length()-1;
            while(i<j) {
                if(b.charAt(i) == b.charAt(j)) {
                    i++;
                    j--;
                }
                else
                    return false;
            }
        return true;
    }

    public static void longestPalindrom(String s) {
        String b;
        palindrom += s.charAt(0);
        for(int i=0; i<s.length(); i++) {
            b="";
            b += s.charAt(i);
           for(int j=i+1; j<s.length(); j++) {
                b += s.charAt(j);
                if(ispalindrom(b) && palindrom.length() < b.length()) {
                    palindrom = b;
                }
           }
        }
    }
    public static void main(String[] args) {
        String s = "babadbdrsghdsghffgjdgnsgvbbgdhjfdhgfdhvhvhvhvhvhvhvhvhvhvhvhvhvhvhvhvhvhgncnmbmjbjbbncbvxcvc";
        longestPalindrom(s);
        System.out.println(palindrom);
    }
}