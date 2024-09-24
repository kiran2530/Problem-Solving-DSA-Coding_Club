public class StringAddition {
    public static String addtion(String s1, String s2) {
        int carry = 0;
        int l = Math.min(s1.length(), s2.length());
        int i = s1.length()-1, j = s2.length()-1;

        StringBuilder sb = new StringBuilder();

        while (i>=0 && j >= 0) {
            int sum = (s1.charAt(i)-48) + (s2.charAt(j)-48) + carry;
            int r = sum % 10;
            carry = sum / 10;
            sb.insert(0, r);
            i--;
            j--;
        }

        if(s1.length() > s2.length()) {
            while (i>=0) {
                int sum = (s1.charAt(i)-48) + carry;
                int r = sum % 10;
                carry = sum / 10;
                sb.insert(0, r);
                i--;
            }
        }
        else {
            while (j>=0) {
                int sum = (s1.charAt(j)-48) + carry;
                int r = sum % 10;
                carry = sum / 10;
                sb.insert(0, r);
                j--;
            }
        }

        if(carry > 0) {
            sb.insert(0, carry);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "999";
        String s2 = "99";
        System.out.println(addtion(s1, s2));
    }
}
