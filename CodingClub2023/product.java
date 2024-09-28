package CodingClub2023;
public class product {
    static String multiplication(String num1,String num2){
        int len1 = num1.length();
        int len2 = num2.length();
        int indexn1 = 0, indexn2 = 0;
        int product1[] = new int[len1 + len2];
        int carry = 0;
        for(int i = len1-1; i>=0; i--) {
            
            carry = 0 ;
            int n1 = num1.charAt(i)-48;

            indexn2 = 0;

            for(int j = len2-1; j>=0; j--) {
                int n2 = num2.charAt(j)-48;
                int add = (n1 * n2 + product1[indexn1 + indexn2] + carry);

                carry = add / 10;
                product1[indexn1 + indexn2] = add % 10 ;
                indexn2++;
            }

            if(carry > 0)
                product1[indexn1 + indexn2] += carry;
            
            indexn1++;
        }

         
        
        String str = "";
        
        for(int i=len1 + len2 -1; i>=0; i--)
            str += product1[i];
        
        if(str.charAt(0)=='0')
            str = str.substring(1 );

        return str;
    }

    public static void main(String[] args) {
        System.out.println(multiplication("1530535", "153053"));
    }
}
