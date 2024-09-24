public class PrimeNumberOfRange {
    public static boolean isPrime(int n) {
        if(n < 2){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static int findPrimeNumber(int l, int r) {
        int min = -1, max = -1;

        for (int i = l+1; i < r; i++) {
            if(isPrime(i)){
                min = i;
                System.out.println("Min : " + min);
                break;
            }
        }

        for (int i = r-1; i > l; i--) {
            if(isPrime(i)){
                max = i;
                System.out.println("Max : " + max);
                break;
            }
        }

        return min + max;
    }
    public static void main(String[] args) {
        int l = 100, r = 200;
        System.out.println(findPrimeNumber(l, r));
    }
}
