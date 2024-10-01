package String;
import java.util.HashMap;

/**
 * CheckAnagram
 */
public class CheckAnagram {
    public static boolean checkAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for(int i = 0; i<s2.length(); i++) {
            if(map.get(s2.charAt(i)) > 0) {
                map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
            }
            else {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "heart";

        if(checkAnagram(s1, s2)) {
            System.out.println("Both Strings are anagrams");
        }
        else {
            System.out.println("Both Strings are not anagrams");
        }
    }
}