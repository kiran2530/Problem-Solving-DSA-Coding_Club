/*
 *  Q) Input : 1234
 *     Output : one two three four
 */
public class IntegerToWordsDirectly {
    public static String integerToWordsDirectly(int n) {
        String[] words = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        StringBuilder ans = new StringBuilder();
        while (n>0) {
            int r = n%10;
            ans.insert(0,words[r]);
            n = n/10;
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(integerToWordsDirectly(n));
    }
}
