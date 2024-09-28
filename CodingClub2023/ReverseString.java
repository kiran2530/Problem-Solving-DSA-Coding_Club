package CodingClub2023;
public class ReverseString {
    public static char[] reveeseString(char[] str) {
        int i=0, j=str.length-1;
        while(i<=j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }
    public static void main(String[] args) {
        char[] str = {'h','e','l','l','o'};
        // char[] str = {'h','a','n','n','a','h'};
        str = reveeseString(str);

        for(int i=0; i<str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
