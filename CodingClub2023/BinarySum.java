package CodingClub2023;
public class BinarySum {
    public static String binarySum(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int idx1 = len1 - 1;
        int idx2 = len2 - 1;
        int carry = 0;
        int max = Math.max(len1, len2);
        int min = Math.min(len1, len2);
        int[] result = new int[ max+1];
        int resultindex = max;

        for(int i = min; i>0; i--) {
            int n1 = str1.charAt(idx1)-48;
            int n2 = str2.charAt(idx2)-48;
            int add = n1 + n2 + carry;
            carry = add/2;
            result[resultindex] = add % 2;
            idx1--;
            idx2--;
            resultindex--;
        }

        if(len1>len2) {
            for(int i =0; i<max-min; i++) {
                int n = str1.charAt(idx1) - 48 ;
                int add = n + carry ;
                carry = add/2;
                result[resultindex] = add%2;
                idx1--;
                resultindex--;
            }
        }
        else{
            for(int i =0; i<max-min; i++) {
                int n = str2.charAt(idx1) - 48 ;
                int add = n + carry ;
                carry = add/2;
                result[resultindex] = add%2;
                idx2--;
                resultindex--;
            }
        }
        result[0] = carry;

        String str = "";
        
        for(int i=0; i<=max; i++)
            str += result[i];
        
        if(str.charAt(0)=='0')
            str = str.substring(1 );

        return str;
    }

    public static void main(String[] args) {
        String s = binarySum("1010", "1011");
        System.out.println(s);
    }
}